package com.testingacademy.ex_Selenium.ex_12102024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
    @Test
    public void dropDown(){
        WebDriver driver= new EdgeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement clickonDropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        clickonDropdown.click();

        Select select = new Select(clickonDropdown);
        select.selectByVisibleText("Option 2");

//        Alert alert= driver.switchTo().alert();
//        alert.sendKeys("");
//        alert.accept();


    }
}
