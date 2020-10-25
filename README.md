# Random Image Demo

[![Build Status](https://travis-ci.com/ismail5701/demo.svg?branch=master)](https://travis-ci.com/ismail5701/demo)

<p>   
    <a alt="Java">
        <img src="https://img.shields.io/badge/Java%20Version-v1.8-blue" />
    </a>
</p>

A spring boot application to fetch random images from the internet and to save the repeatedly queried image url.

*   User can fetch random image
*   User can fetch the image by ID
*   User can fetch all saved image urls

*   Test URL - https://zeta-dem0.herokuapp.com/
     
## Application screenshots

<img src="images\random.PNG"/>
<img src="images\byId.PNG"/>
<img src="images\list.PNG"/>

## The tech stack & Open-source libraries

### Data

* 	[H2](https://www.h2database.com/html/main.html) - Open-Source Embedded Relational Database Engine

### Server - Backend

* 	[JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) - Java™ Platform, Standard Edition Development Kit
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[Maven](https://maven.apache.org/) - Dependency Management

###  Libraries and Plugins

* 	[Lombok](https://projectlombok.org/) - Lombok is used to reduce boilerplate code for model/data objects.

### Others 

* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system
* 	[Postman](https://www.getpostman.com/) - API Development Environment (Testing Documentation)
* 	[Travis CI](https://travis-ci.org/github/ismail5701/tweet-streamer) - A hosted continuous integration service used to build and test software projects hosted at GitHub.

## Running the application locally / Deploying

* 	Download the zip or clone the Git repository.
* 	Unzip the zip file (if you downloaded one)
*   Build the project using below command
```shell
mvn clean install
```
*   Use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Reference

[Lorem Picsum](https://picsum.photos/) - Lorem Picsum
