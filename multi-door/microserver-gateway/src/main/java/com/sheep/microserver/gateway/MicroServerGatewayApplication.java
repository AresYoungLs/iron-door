package com.sheep.microserver.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yangyangSheep
 * @ClassName MicroServerGatewayApplication.java
 * @Description 网关启动类
 * @createTime 2021/5/17 18:20
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.sheep.*")
public class MicroServerGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServerGatewayApplication.class, args);
    }

}
