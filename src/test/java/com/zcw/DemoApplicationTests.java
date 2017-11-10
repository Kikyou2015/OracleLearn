package com.zcw;

import com.zcw.entity.UserEntity;
import com.zcw.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getAll() {
        userMapper.getAll().listIterator().forEachRemaining(u -> logger.info(u.toString()));
        Assert.assertNotEquals(0, userMapper.getAll().size());
    }

    @Test
    public void insertTest() {
        UserEntity u = new UserEntity(Long.valueOf("0"), "tester", "tester@qq.com", "wuhan", Short.valueOf("1"), "sanxin");
        userMapper.insert(u);
    }

    @Test
    public void updateTest() {
        UserEntity u = new UserEntity(Long.valueOf("107"), "myTester", "myTester@qq.com", "beijing", Short.valueOf("1"), "baidu");
        userMapper.update(u);
    }

    @Test
    public void deleteTest() {
        userMapper.delete(Long.valueOf("1"));
    }

    @Test
    public void getUserByIdTest() {
        UserEntity u = userMapper.getUserById(Long.valueOf("107"));
        Assert.assertNotNull(u);
        logger.info(u.toString());
    }
}
