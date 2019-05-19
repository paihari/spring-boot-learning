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

- **hello-web** - Simple MVC application. Just place the `index.html` in static resources, Due to enabled auto configuration, the web page is rendered.

- **static-content** - Usage of Stylesheets. And also use of `webjars` for webside library management

- **thymeleaf-demo** - Templates for Web Development, using thymeleaf, page designers and UI developers can collaborate seemlessly. Include the thymeleaf libs in pom and include namespace xmlns:th="http://www.thymleaf.org" 

- **error-demo** - Demonstrates effectively handling /error and 404 type error situation

- **exception-demo** - Demonstrates how exceptions are handled at Controller level by the use of `@ExceptionHandler`, Second example demonstrates how Exceptions can be handled globally. with the specific class `ExceptionControllerAdvice`

### Data Access 

 - **h2-demo** - Demonstrates the below features
 
     1. By including h2 in spring initializer and specifying `spring.h2.console.enabled=true`and `spring.h2.console.path` login to h2 console is possible through browser
 
     2. The example also shows the JPA entity creation and automatic creation of tables during application start.
 
     3. In Advanced section, instead of old school methods used for CRUD in database, example shows use of Spring data JPA Repository
     
     4. Loading of data during application start through  SQL file by mentioning `spring.datasource.platform=h2`and placing the sql files in resources. 
     5. Loading data during application start programatically, `DataLoader`is the service which loads data to database
     
     
 - **blogger-demo** - Demonstrates the below features with JPA
 
      1. Simple way to create different query methods and stitch to the data service, `HomeController`
      2. `PostController`demonstrates fetching list of blog post, individual post, use of layout for GUI
      3. Production Profile demonstrates connecting to AWS RDS MySQL Database and fetching the data
 
 - **jdbc-demo** - Demonstrates the JDBC demo, with native SQL
 
 - **mangodb-demo** - Its mangotime, so it is Mango. Demonstrates how to CRUD MongoDB
 
 
### Spring Security

- **security-demo** - Simple Security demonstration, select security and web in spring initializer and basic security is put in place(user: user, password: from console). To override the default behaviour use, user and password need to be mentioned in 
` application.properties`


- **securitycustom-demo** - Demonstrates loading of the Security configuration at load time, refer to `SecurityConfig`class

- **db-security-demo** - Demonstartes the user authentication loadaed through mySQL database withe user of  ` Authentication Manager Builder` , `UserDetailService` and `SecurityConfig`. Entitlements are stored in AWS RDS MySQL Dev database

### Rest Spring

- **reststarter-demo** - Simple CRUD implementation of REST services nice and clean API using JPA H2,  JPA repositoties and RestControllers.
For viewing/edit domain objects using Chrome Extensions: JSON Viewer, POSTMAN


- **resterror-demo** - Handling of Business Exception with `ÈxceptionHandler` annotation in Postcontroller


- **restdatahypermedia-demo** - The core library `spring-boot-starter-data-rest` contains MCV, HATEOAS, Jackson and restful standards like HAL, ALPS. The beauty of this is is it provides out of the box the CRUD rest services



