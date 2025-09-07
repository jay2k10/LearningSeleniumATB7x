package com.testingacademy.ex_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LinkTestAll {

    @Test
    public void findAllLinkText(){

        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://hdor.com");

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//        for (int i=0;i< links.size();i++){
//            String linkText = links.get(i).getText();
//            System.out.println(linkText);
//        }
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
          String linkText = links.get(i).getText();
            System.out.println(linkText);
            driver.manage().deleteAllCookies();

            Alert alert = driver.switchTo().alert();
            alert.accept();

        }
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath()));
//        Alert alert = driver.switchTo().alert();
//        alert.accept();


        driver.navigate().forward();


    }
}
