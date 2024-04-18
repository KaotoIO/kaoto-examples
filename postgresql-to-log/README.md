# Query a Postgresql database

This example shows how to query a Postgresql database, using the camel `sql` component, and logs the messages to the console.

## Prerequisites
1. A running Postgresql database
2. The Postgresql driver dependency available in the classpath, in this example, it's added to the `application.properties` file
3. A database named `transactions`
4. A table named `transactions` with the following structure
    | Column name | Data type |
    |-------------|-----------|
    | id          | serial    |
    | timestamp   | timestamp |
    | accountnumber | varchar  |
    | amount      | float8    |

5. Some records in the `transactions` table

## How to run
As an example, here's a SQL script to create the database and table, and insert some records:
```sql
CREATE DATABASE transactions;
USE transactions;

CREATE TABLE transactions.public.transactions (
    id serial NOT NULL,
    "timestamp" timestamp NULL,
    accountnumber varchar NULL,
    amount float8 NULL,
    CONSTRAINT transactions_pk PRIMARY KEY (id)
);

INSERT INTO public.transactions ("timestamp", accountnumber, amount) VALUES ('2021-01-01T00:00:00', '92842238', 100.0);
INSERT INTO public.transactions ("timestamp", accountnumber, amount) VALUES ('2021-01-02T00:00:00', '2873628736', 120.0);
INSERT INTO public.transactions ("timestamp", accountnumber, amount) VALUES ('2021-01-03T00:00:00', '12922878', 320.0);
```

## How to run
1. Open the [`postgresql-to-log.camel.yaml`](postgresql-to-log.camel.yaml) file and set the `PostgresqlDataSource` bean properties to match your Postgresql database, such as `databaseName`, `user`, `password`, `serverName`, and `portNumber`
    1.1. This example expects to have a secret named `postgres` with the following keys:
        * `database-name` containing the database name
        * `database-user` containing the user name
        * `database-password` containing the password
2. Since this example requires the Postgresql dependency, change to the `postgresql-to-log` folder
```shell
cd postgresql-to-log
```
3. Run the integration using the Camel CLI extension, or by executing the following command:
```shell
jbang '-Dcamel.jbang.version=4.5.0' camel@apache/camel run * --dev --logging-level=info
```
