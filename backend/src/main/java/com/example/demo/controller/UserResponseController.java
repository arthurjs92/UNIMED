package com.example.demo.controller;

import com.example.demo.model.UserResponse;
import com.example.demo.service.UserResponseServiceImpl;
import com.example.demo.service.impl.UserResponseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserResponseController implements UserResponseService {
    private final UserResponseServiceImpl userResponseServiceImpl;

    public UserResponseController(UserResponseServiceImpl userResponseServiceImpl) {
        this.userResponseServiceImpl = userResponseServiceImpl;
    }

    @Override
    @PostMapping("/responses")
    @CrossOrigin
    public UserResponse saveUserResponse(@RequestBody UserResponse userResponse) throws Exception {
        return userResponseServiceImpl.saveUserResponse(userResponse);
    }

    @Override
    @GetMapping("/responses/{id}")
    public UserResponse findUserResponseById(@PathVariable Long id) {
        return userResponseServiceImpl.findUserResponseById(id);
    }

    @Override
    @GetMapping("/responses")
    public List<UserResponse> findAllUsersResponse() {
        return userResponseServiceImpl.findAllUsersResponse();
    }

    @Override
    @PutMapping("/responses/{id}")
    public UserResponse updateUserResponse(@RequestBody UserResponse userResponse, @PathVariable Long id) {
        return userResponseServiceImpl.updateUserResponse(userResponse, id);
    }

    @Override
    @DeleteMapping("/responses/{id}")
    public void deleteUserReponse(@PathVariable Long id) {
        userResponseServiceImpl.deleteUserReponse(id);
    }

}
