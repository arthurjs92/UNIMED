package com.example.demo.handler;

public class UserResponseNotFound extends RuntimeException{
    public UserResponseNotFound(Long id) {
        super("Resposta não encontrada " + id);
    }
}
