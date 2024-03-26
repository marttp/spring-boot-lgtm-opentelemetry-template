# Spring Boot 3.2 Project template with LGTM stack

Spring Boot project template with OpenTelemetry and LGTM stack.

Blog TH: [Setup โปรเจค Spring Boot 3.3 กับ OpenTelemetry + LGTM stack (โค้ด Template เอาไปใช้กันได้เลย)](https://tpbabparn.medium.com/setup-โปรเจค-spring-boot-3-3-กับ-opentelemetry-lgtm-stack-โค้ด-template-เอาไปใช้กันได้เลย-1bb91dc9f7f5)

Blog EN: [Spring Boot 3.3 + OpenTelemetry (Agent) with otel-lgtm](https://medium.com/@tpbabparn/spring-boot-3-3-opentelemetry-agent-with-otel-lgtm-c9ecb100998e)

## Tech Stack

* Spring Boot 3.3 
* Java 21 
* Gradle 
* PostgreSQL 
* Testcontainer
* OpenTelemetry agent เอาไว้ใช้กับ Collector

![Diagram for this side project - Spring Boot + OpenTelemetry + LGTM Stack](images/img.png)

## Dashboard from otel-lgtm container

### JVM Overview (OpenTelemetry)

![img.png](images/img_5.png)

### RED Metrics

![img_1.png](images/img_1.png)

## Custom Dashboard

You can get it from /dashboard folder. Just import it to your Grafana

### Logging - Example

![img_2.png](images/img_2.png)

### Tracing - Example

![img_3.png](images/img_3.png)

![img_4.png](images/img_4.png)