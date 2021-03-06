# Start with a base image containing Java runtime
FROM openjdk:11

# Add Maintainer Info
LABEL maintainer="marshall_gj@hotmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/customer-subscription-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} customer-subscription-service.jar

ENTRYPOINT ["java","-jar","/customer-subscription-service.jar"]