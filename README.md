# Spring Boot on Docker

[![Build Status](https://dev.azure.com/shivrajjadhav733/shivrajjadhav733/_apis/build/status/shivrajjadhav733.spring-docker-01?branchName=master)](https://dev.azure.com/shivrajjadhav733/shivrajjadhav733/_build/latest?definitionId=1&branchName=master)

1. Create a `Dockerfile` for creating a docker image from the Spring Boot Application
`FROM openjdk:8
ADD target/spring-docker-01.jar spring-docker-01.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "spring-docker-01.jar"]`

2. Using the Dockerfile create the Docker image.
From the directory of Dockerfile - `docker build . -t spring-docker-01`

3. Run the Docker image (spring-docker-01) created in #2.
`docker run -p 8081:8081 --name spring-docker-01-app -d spring-docker-01`

## Useful Docker commands
- `docker images`
- `docker container ls`
- `docker logs <container_name>`
- `docker container rm <container_name`
- `docker image rm <image_name`
