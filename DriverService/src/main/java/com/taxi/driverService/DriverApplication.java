package com.taxi.driverService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Aleksandr Ivakin
 **/
@SpringBootApplication
//@EnableEurekaServer
public class DriverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriverApplication.class, args);
    }
}
