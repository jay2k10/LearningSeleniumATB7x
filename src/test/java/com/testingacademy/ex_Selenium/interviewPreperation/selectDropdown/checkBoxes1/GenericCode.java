package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.checkBoxes1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericCode {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

       Select select = new Select(driver.findElement(By.id("dropdown-class-example")));

       List<WebElement> options = select.getOptions();

        ArrayList originalList = new ArrayList();
        ArrayList tempList = new ArrayList();

        for(WebElement option : options){
            if(option.getText().equals(select)){
                originalList.add(option.getText());
                tempList.add(option.getText());
            }
        }
        Collections.sort(tempList);
        if(!tempList.equals(originalList)){
            System.out.println("Sorted");

        }else{
            System.out.println("not sorted");
        }



    }
}
