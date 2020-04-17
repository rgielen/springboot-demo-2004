package com.example.springbootdemo.todo;

import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    void accessTodoItem() {
        TodoItem todoItem = new TodoItem();
        System.out.println(todoItem.isCompleted());
    }
}
