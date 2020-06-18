package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamMQmMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQmMain8802.class,args);
    }
}
