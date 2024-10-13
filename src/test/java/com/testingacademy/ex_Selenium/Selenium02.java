package com.testingacademy.ex_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium02 {
    public static void main(String[] args) {
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://app.vwo.com");
    }
}
