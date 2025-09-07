package com.testingacademy.ex_Selenium.FlipKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkart {

        @Test
        public void samsungMobile() {
            ChromiumDriver driver = new ChromeDriver();
            //WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");

            WebElement search = driver.findElement(By.name("q"));
            search.sendKeys("Mobile");
            WebElement clickonSearch = driver.findElement(By.xpath("(//*[local-name()='svg'])[1]"));
            clickonSearch.click();
            WebElement clicksamsungMobile = driver.findElement(By.xpath("(//div[@class ='XqNaEv'])[2]"));
            clicksamsungMobile.click();
            WebElement mobileName = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F05 (Twilight Blue, 64 GB)']"));
            String samsungMobileName = mobileName.getText();
            System.out.println(samsungMobileName);

            Assert.assertEquals(samsungMobileName, "SAMSUNG Galaxy F05 (Twilight Blue, 64 GB)");

            int mobileCount = driver.findElements(By.xpath("//div[@class = 'KzDlHZ']")).size();
            System.out.println("Mobile count is :" + mobileCount);


        }


    }

