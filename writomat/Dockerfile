# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven wrapper and project files to the container
COPY . .

# Download Maven and build the application
RUN ./mvnw clean package

# Copy the JAR file to the container
COPY target/writomat-0.0.1-SNAPSHOT.jar /app/writomat.jar

# Expose port 8080
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/writomat.jar"]
