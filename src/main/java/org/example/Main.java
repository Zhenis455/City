package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        
        City cityService1 = context.getBean("cityService1", City.class);
        City cityService2 = context.getBean("cityService2", City.class);
    
        System.out.println("Город: " + cityService1.getCityName() + ", Население: " + cityService1.getPopulation());
        System.out.println("Город: " + cityService2.getCityName() + ", Население: " + cityService2.getPopulation());
           }
}
