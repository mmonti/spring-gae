package com.acme.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by mmonti on 8/9/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.acme.controller" })
public class MvcConfig {

}