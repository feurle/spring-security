# spring-security
This sample application shows the simple usage of Spring Security.

The standard configuration uses the in-memory h2 database. You can start the application with:

`$ ./mvnw spring-boot:run`


If you want to use Mysql as the database, you have to create a database and edit the jdbc url and credentials 
in the application-mysql.properties. You also have to comment out the
`spring.profiles.include=mysql` property in the main `application.properties` file.
