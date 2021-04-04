# Sample RESTful WS JAVA application built with Spring Boot

### Pre-requisites to run this app
1. Clone this repository;
2. Download and install the [JDK](http://www.oracle.com/technetwork/java/javase/downloads) latest version;
3. Download, install and run [MongoDB](http://www.mongodb.com/download-center), and create the schema "cms";
4. Preferrably use some IDE such as [Eclipse](http://www.eclipse.org/downloads) or [IntelliJ](http://www.jetbrains.com/idea/download), otherwise, you'll need [Maven](http://maven.apache.org/download.cgi) installed and configured on your machine.

### Running the app
1. In your IDE, import the app as Maven project and run a 'maven build' to force downloading and configuring dependencies. If you opted by not using some IDE, go to the project root folder via command line and build it with "mvn";
2. Having compiled the project successfully, run it as 'Java Application' choosing the main class "com.avenue.blog.cms.Application";
3. If no exception popped up in your console, try calling http://localhost:3001/api/products on your browser to see the results.