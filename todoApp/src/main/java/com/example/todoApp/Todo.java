package com.example.todoApp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
@Entity
public class Todo {
    @Id
    private Integer id;
    private String content;
}
