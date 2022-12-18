package org.seayaa.prometheus.usm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "org.seayaa.prometheus.common.feign")
public class PrometheusUsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrometheusUsmApplication.class, args);
    }

}
