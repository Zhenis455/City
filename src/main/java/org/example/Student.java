package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name = "Иван Иванов";

    @Autowired
    private Profession profession;

    public void showInfo() {
        System.out.println("Студент: " + name);
        System.out.println("Профессия: " + profession.getName());
    }
}
