package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericSelectMethod2 {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //By select = By.id("dropdown-class-example");
        WebElement select = driver.findElement(By.id("dropdown-class-example"));
        selectDropDown(select, "index", "2");


    }

//    public static WebElement getElement(By locator) {
//
//        return driver.findElement(locator);
//    }

    public static void selectDropDown(WebElement locator, String type, String value) {
        Select s = new Select(locator);
        switch (type) {
            case "index":
                s.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                s.selectByValue(value);
                break;
            case "text":
                s.selectByVisibleText(value);
            default:
                System.out.println("Please enter the correct selection criteria.");
                break;
        }


    }

}
