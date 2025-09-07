package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class CheckMiddleCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> elementList = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(elementList.size());
        int size = elementList.size();

        for (WebElement checkBox :elementList) {
            String s = checkBox.getAttribute("value");
            if (s != null && s.equals("option2")) {
                checkBox.click();
            }
        }
    }
}
