package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class _100thoptionindropdown {
    public static void main(String[] args) {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement element = driver.findElement(By.id("dropdown-class-example"));

        Select select = new Select(element);
        select.selectByIndex(99);
        //select.selectByValue();
        //select.selectByVisibleText();
    }
}
