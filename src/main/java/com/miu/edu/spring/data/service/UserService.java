package com.miu.edu.spring.data.service;


import com.miu.edu.spring.data.dto.UserDto;

import java.util.List;

public interface UserService {

    /**
     * Get all users
     * @return users
     */
    List<UserDto> getAllUsers();

    /**
     * Get User By id
     *
     * @param id
     * @return a User
     */
    UserDto getUserById(int id);

    /**
     * Update a User
     * @param user
     */
    void updateUser(UserDto user);

    /**
     * Add a User
     * @param user
     */
    void addUser(UserDto user);

    /**
     * Remove a User by id
     * @param id
     */
    void removeById(int id);

}
