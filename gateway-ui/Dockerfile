FROM java:8
COPY /target/gateway-ui-0.0.1-SNAPSHOT.jar /data/
EXPOSE 8080
WORKDIR /data/
CMD ["java", "-jar", "gateway-ui-0.0.1-SNAPSHOT.jar"]
