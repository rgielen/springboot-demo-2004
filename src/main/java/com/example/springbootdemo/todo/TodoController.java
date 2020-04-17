package com.example.springbootdemo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TodoController.
 *
 * @author Rene Gielen
 */
@RestController
@RequestMapping("/todos")
public class TodoController {

    final TodoItemRepository repository;

    @Autowired
    public TodoController(TodoItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<TodoItem> findAllTodos() {
        return repository.findAll();
    }

}
