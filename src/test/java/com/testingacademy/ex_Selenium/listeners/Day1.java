package com.testingacademy.ex_Selenium.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListnerClass.class)
public class Day1 {

    @Test
    public void m1(){
        System.out.println("Test");
    }
    @Test
    public void m2(){
        System.out.println("Test2");
    }
    @Test
    public void m3(){
        System.out.println("Test3");
        Assert.assertTrue(false);
    }
}
