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
        System.out.println("Город: " + cityService1.getCityName() + ", Население: " + cityService1.getPopulation());
        System.out.println("Город: " + cityService2.getCityName() + ", Население: " + cityService2.getPopulation());
        System.out.println("Город: " + cityService3.getCityName() + ", Население: " + cityService3.getPopulation());
        System.out.println("Город: " + cityService4.getCityName() + ", Население: " + cityService4.getPopulation());
    }
}
