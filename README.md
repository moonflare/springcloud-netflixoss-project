# micro-services-config
## Without Docker


For starting up the infraestructure, run the projects using the following order:

1. Run the project inside config-server folder.
	
	You can configure in Eclipse/Intellij or use the command `./mvnw clean install -X -U` inside the directory to build this.
	It will be available on `localhost:9090`.

2. Run the project inside eureka-server folder.
	
	You can configure in Eclipse/Intellij or use the command `./mvnw clean install -X -U` inside the directory to build this.
	Check if it is up by accessing http://localhost:9091
		
3. Checkout email-service project (any folder).

	You can configure in Eclipse/Intellij or use the command `./mvnw clean install -X -U` inside the directory to build this.


4. Run the service (email-template) available in repository https://bitbucket.org/schoolastic-app/email-service.

	You can configure in Eclipse/Intellij or use the command `./mvnw clean install -X -U` inside the directory to build this.

5. Check in http://localhost:9091 if the "email-service" is listed on "Instances currently registered with Eureka".


6. Run the Zuul project available in gateway-server folder.

	You can configure in Eclipse/Intellij or use the command `./mvnw clean install -X -U` inside the directory to build this.
	I recommend using Eclipse/Intellij for debugging.
	It will start on http://localhost:8765

## Reproducing the problem

After all the infraestructure is running, create a request (POST) for the following URI:

	http://localhost:8765/api/email-service/v1/message/new

### With the following payload:

#### Header

	[{"key":"x-api-key","value":"039175eef96048cfb180c295d15e21e1","description":""},{"key":"Content-Type","value":"application/json","description":""}]

#### Body

	{
	"toEmail" : "cleverson.ledur@schoolastic-app.com",
	"values" : [
		{"name":"{{NAME}}", "value" : "test"},
		{"name":"{{EMAIL}}", "value" : "cleverson.ledur@schoolastic-app.com"}
		],
	"templateType":"newResponsibleUser"
	}

## Problem

You will receive a 500 error message. In Zuul (gateway-service) project, you can check the stack with the following message error: "Load balancer does not have available server for client".


# With Docker

1. Run `./buildup.sh` file.

## References

https://www.infoq.com/br/articles/desmistificando-spring-cloud-netflix
https://coderef.com.br/arquitetura-de-microservices-com-spring-cloud-e-spring-boot-parte-3-b84b3dce13a0
https://piotrminkowski.wordpress.com/2017/02/05/part-1-creating-microservice-using-spring-cloud-eureka-and-zuul/
http://www.baeldung.com/spring-cloud-netflix-eureka
http://callistaenterprise.se/blogg/teknik/2015/04/10/building-microservices-with-spring-cloud-and-netflix-oss-part-1/