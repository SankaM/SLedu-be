FROM adoptopenjdk/openjdk12:latest

COPY build/libs/*.jar /libs/app.jar

EXPOSE 3005

ENTRYPOINT ["java", "-jar", "/libs/app.jar"]