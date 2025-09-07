package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SelectCalanderByJS {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
        driver.manage().deleteAllCookies();
        driver.get("https://www.spicejet.com/");
        WebElement date = driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']"));
        String dateVal = "Thu, 17 Apr 2025";
        selectDateByJS(driver,date,dateVal);
    }
    public static void selectDateByJS(WebDriver driver , WebElement element , String dateVal){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);


    }
}