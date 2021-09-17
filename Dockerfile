FROM openjdk:11

EXPOSE 5000

ARG JAR_FILE=target/*.jar

ARG var_name
ENV env_var_name=$var_name

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]