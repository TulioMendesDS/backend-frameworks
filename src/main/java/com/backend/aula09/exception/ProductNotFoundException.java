package com.backend.aula09.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(){
        super("Produto não existe!");
    }
}
