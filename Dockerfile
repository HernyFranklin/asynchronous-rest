FROM adoptopenjdk/openjdk11:jdk-11.0.12_7-alpine-slim

RUN apk add --upgrade openssl

RUN apk upgrade busybox

COPY ./build/libs/*-obf.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]
