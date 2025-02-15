package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Bean(name = "cityService1")
    public City cityService1() {
        return new City("Нью-Йорк", 8419600);
    }

    @Bean(name = "cityService2")
    public City cityService2() {
        return new City("Лондон", 8982000);
    }

    @Bean(name = "cityService3")
    public City cityService3() {
        return new City("Токио", 13929286);
    }

    @Bean(name = "cityService4")
    public City cityService4() {
        return new City("Париж", 2148000);
    }

}
