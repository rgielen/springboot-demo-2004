package com.example.springbootdemo.todo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TodoItemRepository.
 *
 * @author Rene Gielen
 */
public interface TodoItemRepository extends JpaRepository<TodoItem, Integer> {
}
