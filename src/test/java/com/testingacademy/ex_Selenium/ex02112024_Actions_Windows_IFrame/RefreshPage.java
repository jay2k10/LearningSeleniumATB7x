package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshPage {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");

        Actions action = new Actions(driver);
        //action.keyDown(Keys.F5).build().perform();
        WebElement textbox= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        action.contextClick(textbox).build().perform();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.navigate().back();
    }
}
