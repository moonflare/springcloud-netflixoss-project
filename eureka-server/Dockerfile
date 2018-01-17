FROM java:8-jre
MAINTAINER Schoolastic <schoolastic@schoolastic-app.com>

ADD ./target/eureka.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka.jar"]

EXPOSE 8765
