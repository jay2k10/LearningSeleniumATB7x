package com.testingacademy.ex_Selenium.ex_26102024;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium32 {
    @Description("Verify Ebay Print the prices iMac")
    @Test
    public void test_imac_price(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");



        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();

    }


    }

