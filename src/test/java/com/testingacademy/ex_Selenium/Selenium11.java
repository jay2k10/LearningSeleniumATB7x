package com.testingacademy.ex_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium11 {

    // get vs Navigate.to()

    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://bing.com");

        // No back, forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
