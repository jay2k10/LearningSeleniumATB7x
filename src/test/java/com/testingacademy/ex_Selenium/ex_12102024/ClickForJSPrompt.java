package com.testingacademy.ex_Selenium.ex_12102024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ClickForJSPrompt {
    @Test
    public void jsPrompt(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement clickOnPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        clickOnPrompt.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("jayshankar");
        alert.accept();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        String result1= result.getText();
        System.out.println(result1);

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(result,"You entered: jayshankar"));

        Assert.assertEquals(result1,"You entered: jayshankar");
        driver.quit();

    }
}
