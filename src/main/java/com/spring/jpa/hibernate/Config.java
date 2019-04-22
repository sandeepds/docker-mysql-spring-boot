package com.spring.jpa.hibernate;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.spring.jpa.hibernate.Resource")
@Configuration
public class Config {

}
