package com.zcw.mapper;

import com.zcw.entity.User;
import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

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
        userEntityMapper.insert(new User(Long.valueOf("0"), "designer2", null, "wuhan", Short.valueOf("1"), "sanxin", new Date()));
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

    @Test
    public void insertBatchTests() {
        int count = 5;
        List<User> userList = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            User user = new User(Long.valueOf(i), "YYYYYYYY" + i, "YYYYYYYY" + i + "@qq.com", "wuhan", Short.valueOf("0"), "sanxin", new Date());
            userList.add(user);
        }
        userEntityMapper.insertBatch(userList);
    }

    @Test
    public void proSelectTest() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("user_id", Long.valueOf("183"));
        params.put("user_name", "");
        params.put("user_email", "");
        params.put("u_create_time", new Date());
        userEntityMapper.proSelect(params);
        log.info("userId = {}, userName = {}, userEmail = {}, createTime = {}", params.get("user_id"), params.get("user_name"), params.get("user_email"), params.get("u_create_time"));
    }

    @Test
    public void proSelectAllTest() {
        Map<String, Object> params = new HashMap<>();
        userEntityMapper.proSelectAll(params);
        ((List<User>) params.get("u_list")).iterator().forEachRemaining(user -> log.info(user.toString()));
    }
}