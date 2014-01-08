Resolver
========
Sample maven Project(Resolver)
On line system to Create,Read,Update,Delete(CRUD) patient records.
Prerequisites
JDK 1.5 or higher, Apache Tomcat 6+ or J2EE compatible server, MSSQL Server 2008,Eclispse IDE with maven plugin
Technologies
Java 1.5 + Apache Tomcat 6+ MSSQL +maven+ Spring
Initializing Database
MSSQL Server: Assume the MSSQL Server is running on local machine under port 1433. Database configuration is stored on Resolver / main / resources, You can change as you wish. 
Tomcat Server Deployment
Assume tomcat is up and running on your local machine. From the project root folder , run the follwoing 
Go to the pom.xml and right click and go to the maven 
Then give the  goal as tomcat:deploy

More information
http://www.tutorialspoint.com/maven/maven_eclispe_ide.htm

Project Structure 
Project has done using MVC architecture.MVC Pattern isolates the application logic from the user interface layer and supports separation of concerns. Here the Controller receives all requests for the application and then works with the Model to prepare any data needed by the View. The View then uses the data prepared by the Controller to generate a final presentable response. So even though current project has connected to MSSQL Server but it can be changed to any other database....
