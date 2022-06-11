FROM openjdk
#FROM openjdk:11
RUN mkdir -p /usr/src/myapp/database
ADD target/travelagency-0.0.1-SNAPSHOT.jar /usr/src/myapp/travelagency.jar
WORKDIR /usr/src/myapp
CMD [ "java", "-jar", "/usr/src/myapp/travelagency.jar" ]
