package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown._ex09032025;


import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Without select class
        Select select = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
        List<WebElement> options = select.getOptions();

        ArrayList original = new ArrayList();
        ArrayList tempList = new ArrayList();

        for(WebElement option:options){
            //if(!option.getText().equals(select)){
                original.add(option.getText());
                tempList.add(option.getText());
            //}
        }
        Collections.sort(original);

        if(original==tempList){
            System.out.println("sorted");

        }else{
            System.out.println("Not sorted");
        }
//        Actions action = new Actions(driver);
//        action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("s").build().perform();
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("");
    }
}
