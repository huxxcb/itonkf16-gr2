FROM java:8
COPY /target/bikeRest.jar /data/
EXPOSE 9002
WORKDIR /data/
CMD ["java", "-jar", "bikeRest.jar"]
