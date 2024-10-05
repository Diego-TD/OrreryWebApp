FROM gradle:8.10.2-jdk21 as build

WORKDIR /app

COPY gradlew .
COPY gradle ./gradle
COPY build.gradle .
COPY settings.gradle .

COPY src ./src

RUN chmod +x gradlew && ./gradlew clean build

FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy the built JAR from the previous stage
COPY --from=build /app/build/libs/orreryBackend-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]