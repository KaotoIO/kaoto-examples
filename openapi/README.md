# Implement and expose HTTP endpoints according to the OpenAPI schema

This example shows how to implement and expose endpoints according to the OpenAPI schema using operationId mapping to direct component.

`Schemas` folder contains OpenAPI contract definitions ( you may easily create own at https://openapidesigner.com/ )

Generated REST DSL from OpenAPI maps `operationId` endpoints from the contract to `direct:operationId`

## Index
| Name              | Description           | Tags          |
| ---               | ---                   | ---           |
| openapi-to-file               | Camel routes for storing and reading order requests through OpenAPI endpoints in files | #openapi #file #log |

## Prerequisites
1. No prerequisites

## How to run
1. Run the integration:
```shell
camel run openapi-to-file.camel.yaml --dev --open-api schemas/orderapi.schema.json
jbang '-Dcamel.jbang.version=4.5.0' camel@apache/camel run openapi-to-file.camel.yaml --dev --open-api schemas/orderapi.schema.json --logging-level=info
```
2. Send the request:
```shell
curl -H "Content-Type: application/json; charset=UTF-8" --data-binary @inputs/order.json http://localhost:8080/order
curl http://localhost:8080/order/899ac6c6-5939-4a91-8d0b-f0281e6b63ee
```
