package com.acme.config;

import com.acme.model.Car;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static com.googlecode.objectify.ObjectifyService.factory;

/**
 * Created by mmonti on 8/9/16.
 */
@Configuration
@ComponentScan("com.acme.service")
public class AppConfig {

    static {
        factory().register(Car.class);
    }

}
