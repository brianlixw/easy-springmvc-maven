package spring.demo.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoServiceTest {

    @Test
    public void login(){
        assertEquals(0, new DemoService().verify("1","1"));
    }
}