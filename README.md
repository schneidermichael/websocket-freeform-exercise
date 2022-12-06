# Getting Started

## WebSocket URL scheme

```
ws://localhost:8080/mobile-app-development
```

## Run as docker container
### Step 1 - Build a Docker Image with Gradle

```
./gradlew bootBuildImage --imageName=michaelxschneider/websocket-freeform-exercise
```

### Step 2 - Run Docker

#### Without name
```
docker run -p 8080:8080 -t michaelxschneider/websocket-freeform-exercise
```

#### With name
```
docker run -p 8080:8080 --name websocket -t michaelxschneider/websocket-freeform-exercise 
```


### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.0/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.0/gradle-plugin/reference/html/#build-image)
* [WebSocket](https://docs.spring.io/spring-boot/docs/3.0.0/reference/htmlsingle/#messaging.websockets)

### Guides

The following guides illustrate how to use some features concretely:

* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

