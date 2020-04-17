package com.example.springbootdemo.todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoItemRepositoryTest {

    @Autowired
    TodoItemRepository repository;

    @Test
    void canCreateItem() {
        repository.save(new TodoItem());
    }
    
}
