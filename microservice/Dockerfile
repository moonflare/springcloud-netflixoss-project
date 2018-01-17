FROM java:8-jre
MAINTAINER Cleverson Ledur <cleversonledur@gmail.com>

ADD ./target/microservice.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/microservice.jar"]

EXPOSE 9094
