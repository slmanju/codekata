FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/echo-server-1.0-SNAPSHOT.jar echo-server.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "echo-server.jar"]