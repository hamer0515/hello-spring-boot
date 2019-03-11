package com.hbox.spring.boot.hellospringboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDaoTest {

    private static Logger logger = LoggerFactory.getLogger(RedisDaoTest.class);

    @Autowired
    private RedisDao redisDao;

    @Test
    public void testRedis() {
        redisDao.setKey("name", "forezp");
        redisDao.setKey("age", "17");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
    }
}
