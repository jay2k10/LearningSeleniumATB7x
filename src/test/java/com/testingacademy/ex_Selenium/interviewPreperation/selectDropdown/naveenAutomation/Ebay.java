package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Ebay {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
        WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
        search.sendKeys("Book");
        WebElement combo = driver.findElement(By.xpath("//select[@class='gh-search-categories']"));
        combo.click();
        WebElement selectBook = driver.findElement(By.id("gh-cat"));

        //For dynamic id we use contains() method

        Select select= new Select(selectBook);
        select.selectByVisibleText("Books");


    }
}
