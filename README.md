<h1 align="center">
  <img src="https://github.com/KaotoIO/kaoto.io/blob/main/assets/media/logo-kaoto.png" alt="Kaoto">
</h1>

<p align=center>
  <a href="https://github.com/KaotoIO/kaoto-examples/blob/main/LICENSE"><img src="https://img.shields.io/github/license/KaotoIO/kaoto-examples?color=blue&style=for-the-badge" alt="License"/></a>
  <a href="https://www.youtube.com/@KaotoIO"><img src="https://img.shields.io/badge/Youtube-Follow-brightgreen?color=red&style=for-the-badge" alt="Youtube"" alt="Follow on Youtube"></a>
  <a href="https://camel.zulipchat.com/#narrow/stream/441302-kaoto"><img src="https://img.shields.io/badge/zulip-join_chat-brightgreen?color=yellow&style=for-the-badge" alt="Zulip"/></a>
  <a href="https://kaoto.io"><img src="https://img.shields.io/badge/Kaoto.io-Visit-white?color=indigo&style=for-the-badge" alt="Zulip"/></a>
</p><br/>

<h2 align="center">Kaoto - The Integration Designer for <a href="https://camel.apache.org">Apache Camel</a></h2>

<p align="center">
  <a href="https://kaoto.io/docs/installation">Documentation</a> |
  <a href="https://kaoto.io/workshop/">Workshops</a> |
  <a href="https://kaoto.io/contribute/">Contribute</a> |
  <a href="https://camel.zulipchat.com/#narrow/stream/441302-kaoto">Chat</a>
</p>

# Kaoto
Kaoto is a visual editor for Apache Camel integrations. It offers support in creating and editing Camel Routes, Kamelets and Pipes. Kaoto also has a built-in catalog with available Camel components, Enterprise Integration Patterns and Kamelets provided by the Apache Camel community.

Have a quick look at our online demo instance:
https://kaotoio.github.io/kaoto/

# Kaoto Examples
Hosting example integrations provided by users

# How to use
There are a few ways to use these examples:

## [Red Hat Dev Spaces](https://workspaces.openshift.com/#https://github.com/KaotoIO/kaoto-examples.git)
This is the easiest way to get started with the examples. It also provides a full development environment with all the tools you need to develop and test your integrations.

## [vscode.dev](https://vscode.dev/github/KaotoIO/kaoto-examples)
This is a lightweight, browser-based version of Visual Studio Code that lets you develop entirely in the browser. It's a great way to quickly check out the examples.

## Clone the repository and run the examples locally
Alternatively, you could clone the repository and run the examples locally. After cloning the repository, you can follow the instructions from [the Kaoto's quickstart guide](https://kaoto.io/docs/quickstart/) to run the examples.

## Index
| Name                                             | Description                                                                                                                         | Tags                                    |
| ---                                              | ---                                                                                                                                 | ---                                     |
| [Account Transactions](account-transactions)     | A set of camel routes that generates CSV-like records, submits it to a kafka topic and later on store it into a Postgresql database | #kafka #database #sql #postgresql #log  |
| [Batch processing](BatchProcessing)              | A camel route reading from CSV files and store them into a MySQL database                                                           | #csv #mysql #log                        |
| [CSV Processor](csv-processor)              | A set of Camel routes processes a CSV file by splitting and filtering records, storing them in a Postgres database, publishing them to a Kafka topic, and saving any errors to log files.                                               | #csv #postgres #kafka #splitEIP #filterEIP #log                        |
| [kafkaToLog](kafka-to-log)                       | A camel route reading from a kafka topic and logging it to the screen                                                               | #kafka #log                             |
| [OpenAPI](openapi)                               | Camel routes showcasing implementations from OpenAPI contract definitions                                                           | #openapi #file #log                     |
| [postgresql-to-log](postgresql-to-log)           | A camel route querying a Postgresql database and logging it to the screen                                                           | #database #sql #postgresql #log         |
| [rest-cbr-amq](rest-cbr-amq)                     | Using Kaoto Data Mapper for transformations, along with Content based routing connecting to ActiveMQ Artemis                        | #datamapper #activemq                   |
| [Rest-Kafka-Database](Rest-Kafka-Database-Route) | A camel route exposing a Rest endpoint, querying a DB and then reacting to Kafka topics                                             | #database #sql #kafka                   |


## Supporting folder
| Name                                             | Description                                                                                                                         |
| ---                                              | ---                                                                                                                                 |
| [compose](compose)                               | Holds compose files to bootstrap components that might be required to run the examples                                              |
