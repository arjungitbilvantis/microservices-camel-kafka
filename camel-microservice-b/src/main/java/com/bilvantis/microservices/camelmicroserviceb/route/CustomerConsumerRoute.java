package com.bilvantis.microservices.camelmicroserviceb.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CustomerConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("kafka:my-topic?brokers=localhost:9092&groupId=my-group-id")
                .log("Received message: ${body}");

    }
}

