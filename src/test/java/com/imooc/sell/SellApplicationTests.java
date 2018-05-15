package com.imooc.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void repeat() {
        List<Integer> oldList = Arrays.asList(1,2,3,4);
        List<Integer> newList = oldList.stream().map(e -> e * 2).collect(Collectors.toList());
        for (Integer a : newList) {
            System.out.println(a);
        }
    }

}
