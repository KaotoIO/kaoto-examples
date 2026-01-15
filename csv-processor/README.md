# Workshop: CSV Processor

### Purpose

The purpose of this demo is combine different EIPs to process a CSV file. This demo used patients.csv from the following publication:

Jason Walonoski, Mark Kramer, Joseph Nichols, Andre Quina, Chris Moesel, Dylan Hall, Carlton Duffett, Kudakwashe Dube, Thomas Gallagher, Scott McLachlan, Synthea: An approach, method, and software mechanism for generating synthetic patients and the synthetic electronic health care record, <strong>Journal of the American Medical Informatics Association</strong>, 25, 3, 230–238, 2018.

### Prerequisites

1. A CSV file (the one proposed is in this [link](https://mavenanalytics.io/data-playground/hospital-patient-records))
2. A running Kafka cluster
3. A running Postgres database
5. Create a table with the following query:

``` 
CREATE TABLE patients (    
    id integer NOT null,
    birthdate date,
    deathdate date,
    prefix character,
    first character,
    last character,
    suffix character,
    maiden character,
    marital character,
    race character,
    ethnicity character,
    gender character,
    birthplace character,
    address character,
    city character,
    state character,
    county character,
    ZIP integer,
    LAT integer,
    LON integer
);
```

### Workflow

1. Read the CSV file from a local directory and split the file into individual records. => route-csv.camel.yaml
2. Filter patients by missing ZIP code and publish this records into a Kafka message queue and direct to DB and error routes. => filter-publish.camel.yaml
3. Receive the data including ZIP code and store them in a database => db-store.camel.yaml
4. Receive the data without ZIP code and write them as error in an error folder => error-storage.camel.yaml
5. Receive the kafka message => kafka-logger.camel.yaml


