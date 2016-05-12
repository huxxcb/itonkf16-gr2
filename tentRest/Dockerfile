FROM java:8
COPY /target/tentRest.jar /data/
EXPOSE 9001
WORKDIR /data/
CMD ["java", "-jar", "tentRest.jar"]
