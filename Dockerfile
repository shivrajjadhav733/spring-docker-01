FROM openjdk:8
ADD target/spring-docker-01.jar spring-docker-01.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","spring-docker-01.jar"]