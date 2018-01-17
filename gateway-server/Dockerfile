FROM java:8-jre
MAINTAINER Schoolastic <schoolastic@schoolastic-app.com>

ADD ./target/gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]

EXPOSE 8765
