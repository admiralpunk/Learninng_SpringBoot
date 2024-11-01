package com.example.SpringBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("25")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    @Autowired
    private Computer com;
    public void code()
    {
        System.out.println("Alien");
        com.compile();

    }
}
