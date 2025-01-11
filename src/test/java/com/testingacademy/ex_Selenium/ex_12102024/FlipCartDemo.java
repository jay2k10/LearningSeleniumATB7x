package com.testingacademy.ex_Selenium.ex_12102024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("shoes");

        Thread.sleep(3000);

        List<WebElement> shooesNames = driver
                .findElements(By.xpath("//div[@class=\"_1sdMkc LFEi7Z\"]/descendant::div[@class=\"hCKiGj\"]/a[1]"));

        for (WebElement name : shooesNames) {

            System.out.println("shooesNames is " + name.getText());

        }

    }

}
