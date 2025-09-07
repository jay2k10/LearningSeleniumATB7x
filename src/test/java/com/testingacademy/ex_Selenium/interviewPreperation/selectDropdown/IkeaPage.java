package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class IkeaPage {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
        driver.manage().deleteAllCookies();
        driver.get("https://www.ikea.com/in/en/search/?q=lamp");
        List<WebElement> productName = driver.findElements(By.xpath("//span[@class='notranslate plp-price-module__product-name']"));
        for (WebElement name : productName) {
            String itemName = name.getText();
            //System.out.println("Total product Name  is " + itemName);
        }
        List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class='plp-price__integer']"));
        int size = productPrice.size();
        for (int i = 0; i < size; i++) {
            String price = productPrice.get(i).getText();
            //System.out.println("Price is :"+price);
            String removeComma = price.replace(",", "");
            int p = Integer.parseInt(removeComma);
            if (p < 1000) {
                System.out.println("Product name: " + productName.get(i).getText() + " || " + "Price: " + productPrice.get(i).getText());
            }
        }
    }
}