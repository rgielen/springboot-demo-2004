package com.example.springbootdemo.todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TodoItemRepositoryTest {

    @Autowired
    TodoItemRepository repository;

    @Test
    void canCreateItem() {
        repository.save(new TodoItem());
    }

    @Test
    public void canFindByTopic() {
        repository.save(new TodoItem("Foo"));
        var byTopic = repository.findByTopic("Foo");
        assertThat(byTopic).isPresent();
    }

}
