package com.son.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
// With the @EnableZipkinStream server you need to set up and
// configure the services being traced and the Zipkin server to publish/listen to RabbitMQ
// or Kafka for tracing data. The advantage of the @EnableZipkinStreamServer
// annotation is that you can continue to collect trace data even if the Zipkin server is
// unavailable. This is because the trace messages will accumulate the trace data on a
// message queue until the Zipkin server is available for processing the records. If you
// use the @EnableZipkinServer annotation and the Zipkin server is unavailable,
// the trace data that would have been sent by the service(s) to Zipkin will be lost
public class ZipkinServerMain {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerMain.class, args);
    }
}
