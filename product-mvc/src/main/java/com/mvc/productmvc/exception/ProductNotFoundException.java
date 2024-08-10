package com.mvc.productmvc.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String msg) {
        super(msg);
    }
}
