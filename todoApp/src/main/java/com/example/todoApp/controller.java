package com.example.todoApp;
import jakarta.el.BeanNameResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Component
public class controller {
    List<Todo> todoList = new ArrayList<>();

    @Autowired
    Repo repo;

    @PostMapping("/todo")
    public Todo addTodo(@RequestBody Todo todo)
    {

        repo.save(todo);

        return todo;
    }
    @GetMapping("/todo")
    public List<Todo> getTodo()
    {
        return repo.findAll();
    }
    @GetMapping("/hello")
    public String greet()
    {
        return "Hi";
    }
}
