# Spring Boot learning
The Journey of Learning Spring Boot, The various projects navigates through the different aspects of Spring Boot.
We use the default port, so the web output is rendered into **localhost:8080**


## Examples

### Fundamentals

- **app.groovy** - Simple Spring Boot application, run using spring-cli
```sh
    $ spring run app.groovy
```

- **web-initializer** - Create Spring project from https://start.spring.io/, unzip the zip file and run maven command
```sh
    $ mvn clean package
```
The Executable jar can be found in `target` directory, navigate to `target`directory
```sh
    $ java -jar webinitializer-0.0.1-SNAPSHOT.jar
```

- **hello-world** - Simple Hello World Project, created from Idea IDE. `PostController` calls implements Hello World Output

- **injection-demo** - Demonstrates how bean are created and used in the Sping Application. In this example Service annotated  `NotificationService`is created as service and injected into PostContoller. Simple Java bean `User`is marked as Spring bean in main application

- **external-config** - Demonstrates how propetries can be fetched from .propetries file and yaml files, and injecting the properties using @Value annotation

- **configuration-properties** - Demonstrates how propetries can be wrapped in java bean, instead of sprinkling @Value annotation, the java class `MyAppConfig` is annotated with @ConfigurationProperties

- **profile-example** - Demonstrates setting up different profiles using `spring.profiles.active`, Example also shows injection of bean depending on the active profile `DataSourceConfig`


### Web Application











