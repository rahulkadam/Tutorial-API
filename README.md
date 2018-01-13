# Tutorial-API
  This will be the project for software engineer who want to learn Java.
  We will try to cover all the Java concept implementation here.
  Please contribute to project with following things.
  
## Problem Statement : 
        Create Java-NGO Java application which will be used by third parties application for creating tutorials.
        This application will expose api to third party user who want to create tutorial using this platform and want to use.
		following will be the things , this platform will provide.
   - User will able to create his own profile { userId, Name, Address , EmailAddress , Mobile Number , password, enabled , type }
   - user will able to create tutorial { id , Name , language , type , domain , createdBy , updatedBy , lastUpdated , creationDate}
   - User will able to specific blogs to tutorial (BlogId , Text , tutorialId, createdBy , updatedBy , lastUpdated , creationDate)
		
	 Goal of this project to understand and implement java concept. 
	 we are using spring boot for quick start of application. This will help everyone to contribute to project easily.


## Getting Started
 - git clone git@github.com:rahulkadam/Tutorial-API.git
 - mvn clean install --Note make sure you have java 8 , mvn install on machine
 - check Spring boot basic document for more help

## Running the Application :
  - ***mvn spring-boot:run***
  
  The application will start at port __8080__.
  
#### Follow link 
  https://stormpath.com/blog/tutorial-crud-spring-boot-20-minutes
  https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/