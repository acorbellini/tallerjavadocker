FROM openjdk:13-alpine

WORKDIR /app

ADD .mvn /app/.mvn
ADD mvnw /app
RUN chmod +x mvnw

ADD pom.xml /app

RUN ./mvnw dependency:go-offline

ADD src /app/src

ENTRYPOINT [ "./mvnw", "spring-boot:run", "-Dspring.profiles.active=docker" ]

