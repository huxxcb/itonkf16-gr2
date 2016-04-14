FROM java:8
COPY /target/greeting-0.0.1-SNAPSHOT.jar /data/
EXPOSE 8080
WORKDIR /data/
CMD ["java", "-jar", "greeting-0.0.1-SNAPSHOT.jar"]
