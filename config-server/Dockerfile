FROM java:8-jre
MAINTAINER Cleverson Ledur <cleversonledur@gmail.com>

ADD ./target/config.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config.jar"]

EXPOSE 8765
