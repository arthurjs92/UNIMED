package com.example.demo.controller;

import com.example.demo.service.impl.UserResponseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class UserResponseControllerTest {
    @InjectMocks
    private UserResponseController userResponseController;

    @Mock
    private UserResponseService userResponseService;

    @Test
    void test(){

    }
}