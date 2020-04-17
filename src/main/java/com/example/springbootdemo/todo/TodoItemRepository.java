package com.example.springbootdemo.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * TodoItemRepository.
 *
 * @author Rene Gielen
 */
public interface TodoItemRepository extends JpaRepository<TodoItem, Integer> {

    Optional<TodoItem> findByTopic(String foo);

}
