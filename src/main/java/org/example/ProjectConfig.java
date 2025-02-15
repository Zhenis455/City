package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Bean(name = "cityService1")
    public CityService cityService1() {
        return new CityService("Нью-Йорк", 8419600);
    }

    @Bean(name = "cityService2")
    public CityService cityService2() {
        return new CityService("Лондон", 8982000);
    }

    @Bean(name = "cityService3")
    public CityService cityService3() {
        return new CityService("Токио", 13929286);
    }

    @Bean(name = "cityService4")
    public CityService cityService4() {
        return new CityService("Париж", 2148000);
    }

}
