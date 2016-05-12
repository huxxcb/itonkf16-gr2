FROM java:8
COPY /target/ConfigServer.jar /data/
EXPOSE 9000
WORKDIR /data/
CMD ["java", "-jar", "ConfigServer.jar"]
