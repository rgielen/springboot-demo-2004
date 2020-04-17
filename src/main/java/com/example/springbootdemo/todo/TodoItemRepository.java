package com.example.springbootdemo.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * TodoItemRepository.
 *
 * @author Rene Gielen
 */
public interface TodoItemRepository extends JpaRepository<TodoItem, Integer> {

    Optional<TodoItem> findByTopic(String foo);

    @Query("select t from TodoItem t where t.completed=true")
    List<TodoItem> findCompleted();

}
