package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_P2 {

    @Test
    public void Shift() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://text-compare.com/");

        WebElement textArea1 = driver.findElement(By.xpath("//textarea[@name='text1']"));
        textArea1.sendKeys("jay shankar");
        WebElement textArea2 = driver.findElement(By.xpath("//textarea[@name='text2']"));


        Actions action = new Actions(driver);
        action.keyDown(textArea1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        action.keyDown(textArea2,Keys.CONTROL).sendKeys("v").build().perform();
        action.moveToElement(textArea2).contextClick().build().perform();

    }
}
