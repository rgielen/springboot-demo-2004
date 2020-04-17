package com.example.springbootdemo;

/**
 * ErrorStatus.
 *
 * @author Rene Gielen
 */
public class ErrorStatus {

    public final Integer statusCode;
    public final String message;

    public ErrorStatus(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}
