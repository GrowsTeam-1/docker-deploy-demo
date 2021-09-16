FROM openjdk:11

EXPOSE 5000

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENV SECRET_VALUE=${{secrets.SECRET_VALUE}}

ENTRYPOINT ["java","-jar","/app.jar"]