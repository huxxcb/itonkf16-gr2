FROM java:8
COPY /target/ConfigServer-0.0.1-SNAPSHOT.jar /data/
EXPOSE 9000
WORKDIR /data/
CMD ["java", "-jar", "ConfigServer-0.0.1-SNAPSHOT.jar"]
