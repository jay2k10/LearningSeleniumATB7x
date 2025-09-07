package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation.com.TestNG;

import org.testng.annotations.Test;

public class Grouping {
    @Test( groups = "test1")
    public void test1() {
        System.out.println("Test1");
    }

    @Test( groups = "test2")
    public void test2() {
        System.out.println("Test2");
    }
    @Test( dependsOnMethods = "test2")
    public void test3() {
        System.out.println("Test3");
    }
}
