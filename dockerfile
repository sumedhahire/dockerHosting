FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE=target/learning-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]