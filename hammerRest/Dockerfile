FROM java:8
COPY /target/hammerRest.jar /data/
EXPOSE 9003
WORKDIR /data/
CMD ["java", "-jar", "hammerRest.jar"]
