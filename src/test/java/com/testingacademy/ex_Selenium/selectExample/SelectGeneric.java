package com.testingacademy.ex_Selenium.selectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectGeneric {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //By locator = By.id("dropdown-class-example");

        WebElement element = driver.findElement(By.id("dropdown-class-example"));
        selectDropDown(element,"index","2");


    }
//    public static WebElement getLocator(By locator){
//        return driver.findElement(locator);
//    }

    public static void selectDropDown(WebElement element ,String type, String value){
        Select s = new Select(element);
        switch (type){
            case "index":
                s.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                s.selectByValue(value);
                break;
            case "text":
                s.selectByVisibleText(value);
                break;
            default:
                System.out.println("Enter the correct option!!");
        }

    }
}
