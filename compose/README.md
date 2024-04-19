# Compose files
This directory contains the compose files for the different environments.

## Compose files

| File name | Description | Ports |
|-----------|-------------|-------|
| [kafka-postgres.compose](kafka-postgres.compose.yaml) | This compose file deploys a kafka instance, a kafka UI connected and a postgres instance. | kafka:`9092` <br> kafka-ui:`8080` <br> postgres:`5432` |

## How to use
### Podman
#### Prerequisites:
* [Podman](https://podman.io/docs/installation)
* [podman-compose](https://github.com/containers/podman-compose?tab=readme-ov-file#installation)

#### Deploying the compose file
To deploy the compose file with podman, you can use the following command:
```bash
podman-compose -f kafka-postgres.compose.yaml up -d
```

#### Stopping the compose file
To stop the compose file with podman, you can use the following command:
```bash
podman-compose -f kafka-postgres.compose.yaml down
```

### Docker
#### Prerequisites:
* [Docker](https://docs.docker.com/get-docker/)
* [docker-compose](https://docs.docker.com/compose/install/)

#### Deploying the compose file
To deploy the compose file with docker, you can use the following command:
```bash
docker-compose -f kafka-postgres.compose.yaml up -d
```

#### Stopping the compose file
To stop the compose file with docker, you can use the following command:
```bash
docker-compose -f kafka-postgres.compose.yaml down
```
