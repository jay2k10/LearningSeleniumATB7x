package com.testingacademy.ex_Selenium.ex_26102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Selenium34 {
    @Description("Close modal of make my trip")
    @Test
    public void close_Modal(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
       // WebElement close = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        WebElement close = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        close.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();
    }
}
