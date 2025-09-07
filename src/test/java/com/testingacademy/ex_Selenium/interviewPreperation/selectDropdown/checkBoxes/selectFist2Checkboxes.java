package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class selectFist2Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> elementList = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(elementList.size());
        int size = elementList.size();

        for (int i =0;i<size;i++) {
            if(i<2){
                elementList.get(i).click();
            }
        }
    }
}
