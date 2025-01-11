package com.testingacademy.ex_Selenium.ex_12102024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {
    //public static void main(String[] args) {
    @Test
    public void alerts(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

//        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
//        clickForJSAlert.click();
        WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        clickForJSConfirm.click();
//        WebElement clickForOnPromt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
//        clickForOnPromt.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();





        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.textToBePresentInElement(result,"You successfully clicked an alert"));
        wait.until(ExpectedConditions.textToBePresentInElement(result,"You clicked: Ok"));


        String result1 = result.getText();
        Assert.assertEquals(result1,"You clicked: Ok");
    }
}
