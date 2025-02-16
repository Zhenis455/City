package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Profession {
    private String name;

    public Profession() {}

    public Profession(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@Component
@Primary
class Programmer extends Profession {
    public Programmer() {
        super("Программист");
    }
}

@Component
class Designer extends Profession {
    public Designer() {
        super("Дизайнер");
    }
}