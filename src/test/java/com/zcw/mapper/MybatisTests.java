package com.zcw.mapper;

import com.zcw.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MybatisTests {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Test
    public void getAllTests() {
        userEntityMapper.getAll().iterator().forEachRemaining(user -> log.info(user.toString()));
    }

    @Test
    public void insertTest() {
        userEntityMapper.insert(new User(Long.valueOf("0"), "developer2", "developer2@qq.com", "wuhan", Short.valueOf("1"), "sanxin", new Date()));
    }

    @Test
    public void updateTest() {
        userEntityMapper.update(new User(Long.valueOf("109"), "manager2", "manager2@qq.com", "beijing", Short.valueOf("1"), "jingdong", new Date()));
    }

    @Test
    public void deleteTest() {
        userEntityMapper.delete(Long.valueOf("5"));
    }

    @Test
    public void getUserByIdTest() {
        User u = userEntityMapper.getUserById(Long.valueOf("108"));
        Assert.assertNotNull(u);
        log.info(u.toString());
    }
}