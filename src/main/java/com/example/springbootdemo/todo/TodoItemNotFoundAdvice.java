package com.example.springbootdemo.todo;

import com.example.springbootdemo.ErrorStatus;
import com.example.springbootdemo.ItemNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;

/**
 * TodoItemNotFoundAdvice.
 *
 * @author Rene Gielen
 */
@RestControllerAdvice
public class TodoItemNotFoundAdvice {

    @ExceptionHandler(ItemNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    ErrorStatus itemNotFoundHandler(ItemNotFoundException e) {
        return new ErrorStatus(404, e.getMessage());
    }

}
