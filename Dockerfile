FROM openjdk:17-ea-3-jdk-oracle
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
