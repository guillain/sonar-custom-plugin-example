FROM kdvolder/mvn-plus-npm
LABEL maintainer=guillain
ENV container docker

WORKDIR /app

COPY src ./src
COPY conf ./conf
COPY scripts ./scripts
COPY pom.xml ./pom.xml
COPY package.json ./package.json

RUN mvn clean package

