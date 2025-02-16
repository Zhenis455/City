package org.example;
import org.springframework.stereotype.Component;

@Component
public class Profession {
    private String name = "Программист";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
