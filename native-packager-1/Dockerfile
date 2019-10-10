FROM openjdk:8-jre-alpine

# Install bash
RUN apk add --no-cache bash

ENV APPLICATION_HOME /usr/apps/native-packager-1

COPY target/universal/stage $APPLICATION_HOME/

WORKDIR $APPLICATION_HOME/bin
CMD ["./native-packager-1"]
