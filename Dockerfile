# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file
COPY writomat/pom.xml .

# Copy the src directory
COPY writomat/src /app/src

# Download dependencies
RUN mvn dependency:go-offline

# Build the application with Maven
RUN mvn clean package -DskipTests

# Stage 2: Package the application into a minimal JDK image
FROM openjdk:17.0.1-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage to the new image
COPY --from=build /app/target/writomat-0.0.1-SNAPSHOT.jar /app/writomat.jar

# Expose port 8080
EXPOSE 8080

# Define the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/writomat.jar"]
