package com.example.springbootdemo;

/**
 * ItemNotFoundException.
 *
 * @author Rene Gielen
 */
public class ItemNotFoundException extends RuntimeException {

    private final Integer id;

    public ItemNotFoundException(Integer id) {
        super("Item not found with id " + id);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
