FROM openjdk:11.0-jre-slim
EXPOSE 8082
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} cloud-config-client.jar
ENTRYPOINT ["java","-jar","/cloud-config-client.jar"]