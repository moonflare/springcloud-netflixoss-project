#!/bin/sh

cd config-server ; ./mvnw clean install -U ; cd ..
cd eureka-server ; ./mvnw clean install -U ; cd ..
cd gateway-server ; ./mvnw clean install -U ; cd ..
cd microservice ; ./mvnw clean install -U ; cd ..

docker-compose build 
