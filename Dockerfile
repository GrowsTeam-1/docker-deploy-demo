FROM openjdk:11

EXPOSE 5000

ARG JAR_FILE=target/*.jar

ARG my_secret_value
ENV MY_SECRET_VALUE=$my_secret_value

ARG my_secret_mail
ENV MY_SECRET_MAIL=$my_secret_mail

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]