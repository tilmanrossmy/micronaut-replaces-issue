FROM openjdk:14-alpine
COPY build/libs/replaces-issue-*-all.jar replaces-issue.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "replaces-issue.jar"]