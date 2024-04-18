# Account transactions

This example combines a kafka topic, a postgres database, the csv format and a rest endpoint, to simulate account transactions that will be queried through Rest.

## Prerequisites
1. A running Kafka cluster
2. A running Postgresql database
3. A database named `transactions`
4. A table named `transactions` with the following structure
    | Column name | Data type |
    |-------------|-----------|
    | id          | serial    |
    | timestamp   | varchar   |
    | account     | varchar   |
    | amount      | float     |

```sql
CREATE TABLE transactions (
    "timestamp" character varying,
    account character varying,
    amount bigint,
    id integer NOT NULL
);

CREATE SEQUENCE transactions_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE ONLY transactions ALTER COLUMN id SET DEFAULT nextval('public.transactions_id_seq'::regclass);
```

## Workflow
The load is generated using the [load-generator.camel.yaml](load-generator.camel.yaml) file, which creates CSV-like records and submits it into a kafka topic.

Later on, the [data-ingestion.camel.yaml](data-ingestion.camel.yaml) file consume messages from that topic and stores it into a Postgres database.

## How to run
1. Open the [`data-ingestion.camel.yaml`](data-ingestion.camel.yaml) file and set the `PostgresqlDataSource` bean properties to match your Postgresql database, such as `databaseName`, `user`, `password`, `serverName`, and `portNumber`
    1.1. This example expects to have a secret named `postgres` with the following keys:
        * `database-name` containing the database name
        * `database-user` containing the user name
        * `database-password` containing the password
2. Since this example requires the Postgresql dependency, change to the `account-transactions` folder
```shell
cd account-transactions
```
3. Run the integration using the Camel CLI extension, or by executing the following command:
```shell
jbang '-Dcamel.jbang.version=4.5.0' camel@apache/camel run * --dev --logging-level=info
```
4. In another terminal, execute the following command to retrieve records
```shell
curl localhost:8080
```