package spring.demo.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {

    @Test
    public void login(){
        assertEquals(0, new DemoService().verify("1","1"));
    }
}