package com.ostrich.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by alparslanb
 * on 24/05/15.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.ostrich")
@EntityScan(basePackages = "com.ostrich.dao.entity")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
