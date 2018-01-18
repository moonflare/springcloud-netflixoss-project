
# micro-services-config

This is a simple project infraestructure for creating microservices using Spring Cloud and Netflix OSS. 

## Problem

You will receive a 500 error message. In Zuul (gateway-service) project, you can check the stack with the following message error: "Load balancer does not have available server for client".

## Reproducing the Problem

GET request to  http://localhost:8765/email/test (using Zuul)

This produces the following error:

`{
    "timestamp": 1516279185321,
    "status": 500,
    "error": "Internal Server Error",
    "exception": "com.netflix.zuul.exception.ZuulException",
    "message": "GENERAL"
}`

## With Docker

1. Run `./buildup.sh` file.

### References

- https://www.infoq.com/br/articles/desmistificando-spring-cloud-netflix
- https://coderef.com.br/arquitetura-de-microservices-com-spring-cloud-e-spring-boot-parte-3-b84b3dce13a0
- https://piotrminkowski.wordpress.com/2017/02/05/part-1-creating-microservice-using-spring-cloud-eureka-and-zuul/
- http://www.baeldung.com/spring-cloud-netflix-eureka
- http://callistaenterprise.se/blogg/teknik/2015/04/10/building-microservices-with-spring-cloud-and-netflix-oss-part-1/

