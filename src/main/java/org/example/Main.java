package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        City cityService1 = context.getBean("cityService1", City.class);
        City cityService2 = context.getBean("cityService2", City.class);
        City cityService3 = context.getBean("cityService3", City.class);
        City cityService4 = context.getBean("cityService4", City.class);
        System.out.println("Город: " + cityService1.cityName() + ", Население: " + cityService1.population());
        System.out.println("Город: " + cityService2.cityName() + ", Население: " + cityService2.population());
        System.out.println("Город: " + cityService3.cityName() + ", Население: " + cityService3.population());
        System.out.println("Город: " + cityService4.cityName() + ", Население: " + cityService4.population());
    }
}
