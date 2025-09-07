package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.dropdowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;


public class PracticeSelect {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //With select class
//        WebElement sel = driver.findElement(By.id("dropdown-class-example"));
//        Select select = new Select(sel);
//        select.selectByIndex(1);

        //without select class
        driver.findElement(By.id("dropdown-class-example")).click();

        List<WebElement> alloptions = driver.findElements(By.tagName("option"));

        for (WebElement option : alloptions) {
            if (option.getText().equals("Option3")) {
                option.click();
                break;
            }
        }
    }
}
