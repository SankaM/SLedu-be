FROM adoptopenjdk/openjdk12

COPY build/libs/*.jar /libs/app.jar

EXPOSE 3005

ENTRYPOINT ["java", "-server", "-jar", "/libs/app.jar"]