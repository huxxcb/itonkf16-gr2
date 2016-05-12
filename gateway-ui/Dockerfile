FROM java:8
COPY /target/gateway-ui.jar /data/
EXPOSE 80
WORKDIR /data/
CMD ["java", "-jar", "gateway-ui.jar"]
