package com.cogent.ecommerce.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.cogent.ecommerce")
@Import(DBConfig.class)

public class Config {

}
