package com.jojoldu.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
 * 이 파일의 경로를 test.java.com.jojoIdu.book.springboot -> test.java.com.jojoIdu.book.springboot.web 으로 바꿨음.
 * 메인 경로와 같아야 하지만, 경로 오류로 인한 404 오류 메세지 발생하여 경로를 변경함.
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {HelloControllerTest.class}, secure = false)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void return_hello() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}
