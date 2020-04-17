package com.example.springbootdemo.todo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * TodoItem.
 *
 * @author Rene Gielen
 */
@Entity
@Data
public class TodoItem {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 1024)
    private String topic;

    private boolean completed;

    public TodoItem() {
    }

    public TodoItem(String topic) {
        this.topic = topic;
    }

    public TodoItem(String topic, boolean completed) {
        this.topic = topic;
        this.completed = completed;
    }
}
