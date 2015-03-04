axis-ws-example
===============

This project is an example of Axis Web Service development.

The use of this web service is explained in this post : http://www.proxiad.com/talks/2014/12/11/integration-des-applications-legacy-powerbuilder-7-dans-une-architecture-orientee-services/

This project is built with Maven.
* To generate the WAR : mvn clean package
* To start Jetty embedded server (port 9090) : mvn jetty:run
* To generate a web service client : mvn compile -PgenerateClient


