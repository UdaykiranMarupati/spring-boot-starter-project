# Spring Boot Starter Practice Application
#### Getting started
Need gradle to build and run the application.
  - clone the application using https://github.com/UdaykiranMarupati/spring-boot-starter-project.git
 
### Build:

  .after cloning the project to local machine execute below commands to run the application.
```sh
$ cd /spring-boot-starter-project
$ ./gradlew clean build bootrun
```
this might take few minutes if the gradle is not already installed, it will download all the dependencies and then buil the application.
Once the application is build and started then application can be tested using the below URL:
```sh.
http://localhost:8080/sum
```
CURL command to test the application from terminal.
```sh.
CURL COMMAND : curl -X POST \
  http://localhost:8080/sum \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 0ab6b6c7-e782-4a5b-d6fa-d8882b7be7f3' \
  -d '{
  "element1":10,
  "element2":20
}'
```
