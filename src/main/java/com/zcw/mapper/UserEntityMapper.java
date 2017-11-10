package com.zcw.mapper;

import com.zcw.entity.User;

import java.util.List;

public interface UserEntityMapper {

    List<User> getAll();

    void insert(User user);

    void update(User user);

    void delete(Long id);

    User getUserById(Long id);
}