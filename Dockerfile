# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/product-service.jar product-service.jar

# Expose the port your application will run on
EXPOSE 9090

# Command to run the application
ENTRYPOINT ["java", "-jar", "product-service.jar"]