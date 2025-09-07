package com.testingacademy.ex_Selenium.selectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LastDropdownSelect {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        int options = select.getOptions().size();
        select.selectByIndex(options-1);
    }
}
