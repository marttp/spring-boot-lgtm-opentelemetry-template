FROM azul/zulu-openjdk-alpine:21-jre
WORKDIR /app

ADD build/libs/app.jar app.jar
ADD build/agent/opentelemetry-javaagent.jar opentelemetry-javaagent.jar

EXPOSE 8080
ENTRYPOINT java -jar -javaagent:opentelemetry-javaagent.jar app.jar