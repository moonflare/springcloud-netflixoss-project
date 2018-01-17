#!/bin/bash

git submodule update --recursive --remote

cd src/main/resources/templates/

npm install

npm run build

