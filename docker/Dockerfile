FROM ubuntu
RUN apt-get update
RUN apt-get install openjdk-8-jdk -y
RUN mkdir /app
COPY MyApp-1.0-SNAPSHOT.jar /app
ENTRYPOINT ["java","-jar","/app/MyApp-1.0-SNAPSHOT.jar"]
