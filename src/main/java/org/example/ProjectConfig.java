package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    public List<Student> students() {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student(new org.example.Programmer());
        s1.setName("Иван Иванов");

        Student s2 = new Student(new org.example.Programmer());
        s2.setName("Петр Петров");

        Student s3 = new Student(new org.example.Programmer());
        s3.setName("Сергей Сергеев");

        Student s4 = new Student(new org.example.Designer());
        s4.setName("Анна Смирнова");

        Student s5 = new Student(new org.example.Designer());
        s5.setName("Мария Козлова");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        return students;
    }
}