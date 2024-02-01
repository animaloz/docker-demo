FROM openjdk:19
COPY target/docker-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8080
EXPOSE 80
CMD ["java", "-jar", "/app.jar"]

