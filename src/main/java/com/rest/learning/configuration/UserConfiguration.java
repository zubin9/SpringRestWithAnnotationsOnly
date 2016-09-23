package com.rest.learning.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@enablewebmvc is same as <mvc:annotation-driven> in xml
//@ComponentScan is same as <context:component-scan> in xml

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.rest.learning")
public class UserConfiguration {

}
