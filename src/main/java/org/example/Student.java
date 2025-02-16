package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Student {
    private String name;

    private final Profession profession;

    @Autowired
    public Student(Profession profession) {
        this.profession = profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Студент: " + name + ", Профессия: " + profession.getName());
    }
}
