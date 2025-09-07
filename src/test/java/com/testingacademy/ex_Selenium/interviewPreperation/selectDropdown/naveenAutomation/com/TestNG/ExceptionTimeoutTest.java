package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation.com.TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

    @Test(timeOut = 1000)
    public void infiniteLoopTest() {
        int i = 1;
        while (i == 1) {
            System.out.println(i);
        }
    }
}
