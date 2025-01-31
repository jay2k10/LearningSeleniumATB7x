package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class DragAndDrop {

    @Test
    public void drag() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");



        WebElement from = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(from,"A"));
        WebElement to = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions action = new Actions(driver);
        action.dragAndDrop(from, to).build().perform();

        //Robot robot= new Robot();

        Actions action1 = new Actions(driver);
        action1.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("s").build().perform();


    }
}
