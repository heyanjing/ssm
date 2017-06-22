package com.he.ssm.dao;

import com.alibaba.fastjson.JSON;
import com.he.ssm.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by heyanjing on 2017/6/21 11:46.
 */

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath*:applicationContent.xml","classpath*:spring-mybatis.xml"})
public class UserMapperTest {
    private static final Logger log = LoggerFactory.getLogger(UserMapperTest.class);
    @Autowired
    UserMapper userMapper;
    @Test
    public void deleteByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() throws Exception {
    }

    @Test
    public void insertSelective() throws Exception {
        User user = new User();
        user.setUserName("我操");
        user.setAge(11);
        userMapper.insertSelective(user);
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        User user = userMapper.selectByPrimaryKey(1);
        log.info("{}", JSON.toJSONString(user));
        List<User> users = userMapper.selectAll();
        log.info("{}", JSON.toJSONString(users));


    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

}