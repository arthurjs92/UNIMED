package com.example.demo.service.impl;

import com.example.demo.model.UserResponse;

import java.util.List;

public interface UserResponseService {
    UserResponse saveUserResponse(UserResponse userResponse) throws Exception;
    UserResponse findUserResponseById(Long id);
    List<UserResponse> findAllUsersResponse();
    UserResponse updateUserResponse(UserResponse userResponse, Long id);
    void deleteUserReponse(Long id);
}
