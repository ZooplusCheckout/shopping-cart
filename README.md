# shopping-cart

We would like to run the interview as a kind of pair programming session. We will ask you to share your screen
during the interview and tell us your ideas, communicate your doubts and explain your actions as much as possible. 

In short, you will be asked to implement a shopping cart application that will include several REST APIs. We will
share the details of the task during the interview.

The main requirement is clean and testable code. Plan to provide some minimal test coverage too. The implemented
APIs should be secure and scalable.

## Prerequisites

You will need to have the following software installed on your computer:
- Any IDE (we use IntelliJ IDEA)
- Java 11 or newer
- Git

Please, fork the repository to be able to git-clone and git-push the project freely.

## Project dependencies

The project is Spring Boot application built with Maven.

The following dependencies are the ones it makes sense to note:
- Springfox Swagger (generates a web page for showing and testing your APIs),
- Hibernate,
- H2 in-memory database.

You will be able to add any dependencies you find helpful during development.

## Swagger

After you have built and started the project, you will be able to test your APIs using the following URL:

http://localhost:8080/swagger-ui/index.html

All Spring controllers you add to the application will be available here.