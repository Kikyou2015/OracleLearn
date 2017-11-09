package com.zcw.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTests {

    private Logger logger= LoggerFactory.getLogger(getClass());

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getAll(){
        userMapper.getAll().iterator().forEachRemaining(u -> logger.info(u.toString()));
    }
}