FROM openjdk:8-jre-alpine

ENV APPLICATION_HOME /usr/apps/native-package-1

COPY target/universal/stage $APPLICATION_HOME/

WORKDIR $APPLICATION_HOME/bin
ENTRYPOINT ["sh", "-c"]
CMD ["exec native-package-1"]