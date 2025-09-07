package com.testingacademy.ex_Selenium.selectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WithoutSelectClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("dropdown-class-example")).click();
        List<WebElement> options = driver.findElements(By.tagName("option"));

        for(WebElement option : options){
            if(option.getText().equals("Option1")){
                option.click();
                break;
            }
        }

    }
}
