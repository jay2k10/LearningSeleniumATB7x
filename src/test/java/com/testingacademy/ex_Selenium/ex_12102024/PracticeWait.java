package com.testingacademy.ex_Selenium.ex_12102024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PracticeWait {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("");

//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();

//        Select select = new Select()
//                select.selectByVisibleText("");
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
