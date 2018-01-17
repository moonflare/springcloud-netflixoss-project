#!/bin/sh

cd config-server ; ./mvnw clean install -U -Dmaven.test.skip=true; cd ..
cd eureka-server ; ./mvnw clean install -U -Dmaven.test.skip=true; cd ..
cd gateway-server ; ./mvnw clean install -U -Dmaven.test.skip=true; cd ..
cd microservice ; ./mvnw clean install -U -Dmaven.test.skip=true; cd ..

docker-compose build 
