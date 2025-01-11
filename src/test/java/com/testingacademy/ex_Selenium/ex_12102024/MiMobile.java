package com.testingacademy.ex_Selenium.ex_12102024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;

public class MiMobile {
    WebDriver driver;

    @BeforeTest
    public void startBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

    }

    @Test
    public void miMobile() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Mi Phones");
        List<WebElement> clickOnSearchButton = driver.findElements(By.xpath("//*[name()='svg']"));
        clickOnSearchButton.get(0).click();
        List<WebElement> phoneNames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
//        for(WebElement PhoneNames:phoneNames){
//            System.out.println(PhoneNames.getText());
//            //System.out.println(PhoneNames.getSize());
//        }
        List<WebElement> phonePrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
//        for(WebElement PhonePrice:phonePrice){
//            System.out.println(PhonePrice.getText());
//            //System.out.println(PhonePrice.getSize());
//
//        }
        int size = Math.min(phoneNames.size(), phonePrice.size());
        int max_price = Integer.MIN_VALUE;
        int Min_price = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {


            String stringPrice = phonePrice.get(i).getText();
            //System.out.println(stringPrice);
            String remveRupeeSign = stringPrice.substring(1);
            System.out.println(remveRupeeSign);
            String removeComma = remveRupeeSign.replaceAll(",", "");
            System.out.println(removeComma);
            int intPrice = Integer.parseInt(removeComma);
            System.out.println(intPrice);
            System.out.println("Phone Name: " + phoneNames.get(i).getText() + " || " + "Phone Price: " + phonePrice.get(i).getText());
            max_price = Math.max(intPrice, max_price);
            Min_price = Math.min(intPrice, Min_price);


        }

        System.out.println("Max Phone price is :" + max_price);

        System.out.println("Minimum phone price is :" + Min_price);

    }

}
