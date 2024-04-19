# Read a Kafka topic

This example shows how to read a Kafka topic, using the camel `kafka` component, and logs the messages to the console.

## Prerequisites
1. A running Kafka cluster
2. A topic named `test-topic` with some messages in it

## How to run
1. Open the `kafka-to-log.camel` file and set the `brokers`, `topic` and `saslJaasConfig` values to match your Kafka cluster
    1.1. This example uses the `SCRAM-SHA-256` SASL mechanism. If you are using a different mechanism, you need to change the `saslJaasConfig` value accordingly
    1.2. This example expects to have a secret named `kafka-user-passwords` with a `client-passwords` key containing the password for the Kafka cluster
2. Run the integration using the Camel CLI extension, or by executing the following command:
```shell
jbang '-Dcamel.jbang.version=4.5.0' camel@apache/camel run kafka-to-log.camel --dev --logging-level=info --local-kamelet-dir=.
```

## Parameters example
You can pass the Kafka consumer parameters as plain values, environment variables or secrets. Here is an example of how to pass the parameters as plain values:
```yaml
parameters:
    brokers: kafka-cluster-name:port
    clientId: camel-route-client
    saslJaasConfig: org.apache.kafka.common.security.scram.ScramLoginModule required username="user1" password="password";
    saslMechanism: SCRAM-SHA-256
    securityProtocol: SASL_PLAINTEXT
```

Here is an example of how to pass the parameters as secrets:
```yaml
parameters:
    brokers: kafka-cluster-name:port
    clientId: camel-route-client
    saslJaasConfig: org.apache.kafka.common.security.scram.ScramLoginModule required username="user1" password="{{secret:kafka-user-passwords/client-passwords}}";
    saslMechanism: SCRAM-SHA-256
    securityProtocol: SASL_PLAINTEXT
```
