#!/bin/bash

VERSION="${1:-8.1.0}"
BUILD_DIR="./build"

if [ ! -d ${BUILD_DIR} ]; then mkdir build; fi

docker build --rm -t sonarplugin . 
docker run -it -d --name sonarplugin sonarplugin 
docker cp sonarplugin:/app/target/sonar-example-plugin-${VERSION}.jar ${BUILD_DIR}/
docker stop sonarplugin
docker rm sonarplugin

exit 0

