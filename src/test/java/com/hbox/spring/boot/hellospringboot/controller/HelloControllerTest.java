package com.hbox.spring.boot.hellospringboot.controller;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @LocalServerPort
    private int port;
    private URL base;
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setUp() throws MalformedURLException {
        this.base= new URL("http://localhost:" + port + "/hello");
    }

    @Test
    public void getHello() {
        ResponseEntity<String> response = testRestTemplate.getForEntity(base.toString(), String.class);
        Assert.assertThat(response.getBody(), IsEqual.equalTo("Greetings from Spring Boot!"));
    }

}
