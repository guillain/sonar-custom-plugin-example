#!/bin/bash

BUILD_DIR="./build"

if [ ! -d ${BUILD_DIR} ]; then mkdir build; fi

docker build --rm -t sonarplugin . 
docker run -it -d --name sonarplugin sonarplugin 
docker cp sonarplugin:/app/target/sonar-disclaimer-plugin-8.9.0.jar ${BUILD_DIR}/
docker stop sonarplugin
docker rm sonarplugin
