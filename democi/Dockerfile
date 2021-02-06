FROM albertoclarit/hisd3base:1.0.3


VOLUME /tmp
WORKDIR /app
ADD build/libs/democi-0.0.1-SNAPSHOT.jar    /app/democi.jar
RUN chmod a+w /app

EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Djava.awt.headless=true","-jar","/app/democi.jar"]


