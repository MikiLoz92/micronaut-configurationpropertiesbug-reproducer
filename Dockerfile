FROM openjdk:14-alpine
COPY build/libs/configurationproperties-bug-reproducer-*-all.jar configurationproperties-bug-reproducer.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "configurationproperties-bug-reproducer.jar"]