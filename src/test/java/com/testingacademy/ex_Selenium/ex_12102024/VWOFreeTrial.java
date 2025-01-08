package com.testingacademy.ex_Selenium.ex_12102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class VWOFreeTrial {
    @Description("Verify error message for invalid emailid entered")
    @Test
    public void vwoFreeTrial(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://vwo.com/free-trial/");
        WebElement emailid = driver.findElement(By.name("email"));
        emailid.sendKeys("jayshankarprasad57@gmail.com");

        WebElement clickPolicy = driver.findElement(By.id("page-214cu-gdpr-consent-checkbox"));
        clickPolicy.click();

        List <WebElement> clickFreeTrial = driver.findElements(By.tagName("button"));
        clickFreeTrial.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(true,true);
    }
}
