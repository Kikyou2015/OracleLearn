package com.zcw.mapper;

import com.zcw.entity.User;

import java.util.List;
import java.util.Map;

public interface UserEntityMapper {

    List<User> getAll();

    void insert(User user);

    void update(User user);

    void delete(Long id);

    User getUserById(Long id);

    void insertBatch(List<User> userList);

    void proSelect(Map<String, Object> params);
}