package com.testingacademy.ex_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium03 {

    @Test
    public void test_001() {
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://app.vwo.com");
        firefoxDriver.quit();


    }

}