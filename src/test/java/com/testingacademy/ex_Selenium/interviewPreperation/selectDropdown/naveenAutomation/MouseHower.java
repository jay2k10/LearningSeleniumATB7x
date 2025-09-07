package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHower {
   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.spicejet.com/");
        Actions action = new Actions(driver);
        WebElement addOns = driver.findElement(By.xpath("//div[text()='Add-ons']"));
        action.moveToElement(addOns).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[text()='Extra Seat'])[1]")).click();

    }
}
