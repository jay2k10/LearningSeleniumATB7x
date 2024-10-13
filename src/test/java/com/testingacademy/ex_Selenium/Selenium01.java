package com.testingacademy.ex_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium01 {
    public static void main(String[] args) {
        //ChromeDriver driver = new ChromeDriver();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
    }
}
