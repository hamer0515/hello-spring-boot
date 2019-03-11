package com.hbox.spring.boot.hellospringboot.controller;

import com.hbox.spring.boot.hellospringboot.config.ConfigBean;
import com.hbox.spring.boot.hellospringboot.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LucyController {
    @Autowired
    ConfigBean configBean;
    @Autowired
    User user;

    @RequestMapping("/lucy")
    public String lucy(){
        return configBean.getGreeting() + "-" + configBean.getName() + "-" + configBean.getUuid() + "-" + configBean.getMax();
    }

    @RequestMapping("/user")
    public String user(){
        return user.getName() + ":" + user.getAge();
    }
}
