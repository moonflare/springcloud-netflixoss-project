FROM java:8-jre
MAINTAINER Cleverson Ledur <cleversonledur@gmail.com>

ADD ./target/eureka.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka.jar"]

EXPOSE 9091
