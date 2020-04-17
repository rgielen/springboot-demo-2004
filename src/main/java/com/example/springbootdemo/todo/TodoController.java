package com.example.springbootdemo.todo;

import com.example.springbootdemo.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

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

    @GetMapping("/{id}")
    TodoItem findOne(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @PostMapping
    @ResponseStatus(CREATED)
    TodoItem create(@RequestBody TodoItem todoItem) {
        todoItem.setId(null);
        return repository.save(todoItem);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    TodoItem update(@PathVariable Integer id, @RequestBody TodoItem todoItem) {
        todoItem.setId(id);
        return repository.save(todoItem);
    }

}
