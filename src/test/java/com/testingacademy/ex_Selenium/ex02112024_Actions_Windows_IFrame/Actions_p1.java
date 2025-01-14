package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_p1 {
    WebDriver driver;

    @BeforeTest
    public void open_Browser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
        @Test
        public void upper_Case(){
            driver.get("https://awesomeqa.com/practice.html");
            WebElement input_Box = driver.findElement(By.xpath("//input[@name='firstname']"));
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.SHIFT).sendKeys(input_Box, "jay shankar").keyUp(Keys.SHIFT).build().perform();

    }
}