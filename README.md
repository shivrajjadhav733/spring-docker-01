# Spring Boot on Docker

1. Create a `Dockerfile` for creating a docker image from the Spring Boot Application
`FROM openjdk:8
ADD target/spring-docker-01.jar spring-docker-01.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "spring-docker-01.jar"]`

2. Using the Dockerfile create the Docker image.
From the directory of Dockerfile - `docker build . -t spring-docker-01`

## Useful Docker commands
- `docker images`
- `docker container ls`
- `docker logs <container_name>`
- `docker container rm <container_name`
- `docker image rm <image_name`
