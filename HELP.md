# Architecture

The selected architecture for this project has been Spring Boot 2.4.5 with java 11 in a linux environment.
I have selected this approach because it is very straightforward. The project is very easy to set using
https://start.spring.io/ already with maven working. Creating a jar file as result is also very convenient. 
Maybe a war file and a web application server (like jetty or tomcat) could be better for big applications 
in a production environment, but for small applications (and not so small) this is a very good and easy
way to share and distribute an application.

Beside this, Spring provides very powerful tools for developing in an integrated environment. And it also
has a strong community behind in case of problems or doubts.

# Read Me First

The Coindesk API (https://www.coindesk.com/coindesk-api) has been use to retrieve the current and historical bitcoin / USD rate.

The project has already been built with maven. To build it again point the environment variable JAVA_HOME to a valid java 11 jre path and run:

./mvnw clean install

A couple of simple test units are executed during the build.

# Getting Started

To run the application just execute:

java -jar target/searchmetrics-bitcoint-test-0.0.1-SNAPSHOT.jar 1000

The parameter is the number of milleseconds to check the Coindesk API. Should be a valid number between 1 and 60 seconds (in milliseconds) in other
case 5 seconds are used by default.

To request the web services just use a browser and type:

http://localhost:8080/bitcoin-latest
http://localhost:8080/bitcoin-historical/2020-10-10/2020-10-20

or with curl

curl http://localhost:8080/bitcoin-latest
curl http://localhost:8080/bitcoin-historical/2020-10-10/2020-10-20
