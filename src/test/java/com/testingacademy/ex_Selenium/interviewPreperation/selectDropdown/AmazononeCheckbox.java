package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class AmazononeCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search Amazon']"));
        boolean flag=searchBox.isDisplayed();
        System.out.println(flag);
        searchBox.sendKeys("iphone", Keys.ENTER);

        WebElement checkBox = driver.findElement(By.xpath("//div//span[text()='AT&T Wireless']"));
        boolean b = checkBox.isEnabled();
        if(!b){
            checkBox.click();
        }
    }
}