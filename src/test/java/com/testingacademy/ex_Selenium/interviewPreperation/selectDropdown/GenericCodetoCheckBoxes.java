package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GenericCodetoCheckBoxes {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        selectCheckBox("Apply AT&T Wireless filter to narrow results");
        selectCheckBox("Apply TracFone Wireless filter to narrow results");


    }
    public static void selectCheckBox(String displayText){
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search Amazon']"));
        searchBox.sendKeys("iphone", Keys.ENTER);

        WebElement input = driver.findElement(By.xpath("//a[@aria-label='"+displayText+"']/descendant::div"));

        boolean b=input.isSelected();
        if(!b){
            input.click();
        }


    }
}