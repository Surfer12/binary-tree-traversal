package com.binarytree.exception;

public class TreeException extends RuntimeException {
    public TreeException(String message) {
        super(message);
    }

    public TreeException(String message, Throwable cause) {
        super(message, cause);
    }
} 