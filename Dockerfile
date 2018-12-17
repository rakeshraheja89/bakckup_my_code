FROM openjdk:8-jdk-alpine
WORKDIR /usr/src/app
COPY . .
EXPOSE 3001
CMD java -jar /usr/src/app/build/libs/ninja-dashboard-0.1.0.jar

