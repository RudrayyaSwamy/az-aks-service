FROM eclipse-temurin:21-jdk
VOLUME /tmp
COPY target/*.jar app.jar
# Set memory options
ENTRYPOINT ["java", "-Xms128m", "-Xmx256m", "-jar", "/app.jar"]
