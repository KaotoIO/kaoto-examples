# Workshop: CSV Processor

### Purpose

The purpose of this demo is combine different EIPs to process a CSV file. This demo used patients.csv from the following publication:

Jason Walonoski, Mark Kramer, Joseph Nichols, Andre Quina, Chris Moesel, Dylan Hall, Carlton Duffett, Kudakwashe Dube, Thomas Gallagher, Scott McLachlan, Synthea: An approach, method, and software mechanism for generating synthetic patients and the synthetic electronic health care record, <strong>Journal of the American Medical Informatics Association</strong>, 25, 3, 230–238, 2018.

### Prerequisites

1. A CSV file (the one proposed is in this [link](https://mavenanalytics.io/data-playground/hospital-patient-records))
2. A running Kafka cluster
3. A running Postgres database

### Workflow

1. Read the CSV file from a local directory and split the file into individual records. => route-csv.camel.yaml
2. Filter patients by missing ZIP code and publish this records into two Kafka message queues. => filter-publish.camel.yaml
3. Receive the data including ZIP code and store them in a database => db-store.camel.yaml
4. Receive the data without ZIP code and write them as error in an error folder => error-storage.camel.yaml


