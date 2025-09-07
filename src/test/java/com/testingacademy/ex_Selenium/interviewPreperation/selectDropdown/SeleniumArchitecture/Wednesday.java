package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.SeleniumArchitecture;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wednesday {
    static WebDriver driver;
    public static void main(String[] args) {
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        //firstName.click();
        Actions action = new Actions(driver);
        action.moveToElement(firstName).click().keyDown(Keys.SHIFT).sendKeys("jay shankar").build().perform();
        //action.keyDown(Keys.SHIFT).sendKeys(firstName, "jay shankar").keyUp(Keys.SHIFT).build().perform();

    }
}
