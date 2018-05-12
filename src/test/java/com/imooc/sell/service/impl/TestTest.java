package com.imooc.sell.service.impl;

import com.imooc.sell.VO.aaa;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTest {

    @Autowired
    private Test test;
    @org.junit.Test
    public void getTest() {
        test.test();
    }



}