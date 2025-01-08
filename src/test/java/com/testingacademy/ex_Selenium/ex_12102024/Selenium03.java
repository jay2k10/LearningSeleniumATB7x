package com.testingacademy.ex_Selenium.ex_12102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium03 {

    @Test
    public void test_001() {
        WebDriver driver = new FirefoxDriver();
        driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();


    }

}