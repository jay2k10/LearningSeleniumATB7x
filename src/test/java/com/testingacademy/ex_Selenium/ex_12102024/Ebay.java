package com.testingacademy.ex_Selenium.ex_12102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ebay {

    @Description("Search macmini and print all prices")
    @Test
    public void print_imac_price() {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement search_box = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        search_box.sendKeys("macmini");
        WebElement search_btn = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        search_btn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Print all the titles
        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-item__title']"));
        int a= searchTitles.size();
        System.out.println(a);
        //System.out.println(searchTitles);
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='s-item__price']"));
        int b = prices.size();
        System.out.println(b);
        
        int size = Math.min(searchTitles.size(), prices.size());
        for (int i = 0; i < size; i++) {
            //System.out.println("Title" +searchTitles.get(i).getText());
            //System.out.println("Price" +prices.get(i).getText());
            System.out.println("Title: " + searchTitles.get(i).getText() + " || " + "Price: " + prices.get(i).getText());

            // Find max and min price in array list

//            int max =  0;
//            for (int j = 0; j < prices.size(); j++) {
//                if(max>prices.size()){
//                    System.out.println(j);
//
//                }else {
//                    System.out.println("nothing");
//                }
            //double maxPrice = Collections.max(prices);

            }

        }

    }
}