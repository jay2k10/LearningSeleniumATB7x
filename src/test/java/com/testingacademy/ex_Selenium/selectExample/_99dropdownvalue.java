package com.testingacademy.ex_Selenium.selectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class _99dropdownvalue {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement element = driver.findElement(By.id("dropdown-class-example"));

        Select select = new Select(element);
        select.selectByIndex(99);

    }
}
