package com.testingacademy.ex_Selenium.ex_27102024;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpractice {
    EdgeDriver driver;

    @BeforeTest
    public void open_browser(){
        driver = new EdgeDriver();
    }
    @Description("Open google.com")
    @Test
    public void open_url(){
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }
    @AfterTest
    public void close_browser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
