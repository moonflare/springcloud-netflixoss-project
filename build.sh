#!/bin/sh

cd config-server ; ./mvnw clean install -X -U ; cd ..
cd eureka-server ; ./mvnw clean install -X -U ; cd ..
cd gateway-server ; ./mvnw clean install -X -U ; cd ..

docker-compose build 
