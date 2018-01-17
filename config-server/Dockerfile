FROM java:8-jre
MAINTAINER Schoolastic <schoolastic@schoolastic-app.com>

ADD ./target/config.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config.jar"]

EXPOSE 8765
