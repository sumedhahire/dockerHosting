FROM openjdk:11


COPY ./src src/
COPY ./pom.xml pom.xml

RUN mvn clean package 

FROM eclipse-temurin:17-jre-alpine
COPY --from=builder target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
