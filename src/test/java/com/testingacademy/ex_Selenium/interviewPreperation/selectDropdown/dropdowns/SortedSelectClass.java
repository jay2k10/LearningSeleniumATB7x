package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSelectClass {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        List<WebElement> options = select.getOptions();

        ArrayList originalList = new ArrayList();

        ArrayList tempList = new ArrayList();

        for (WebElement k : options) {
            System.out.println(k.getText());
            if (!k.getText().equals(select)) {
                originalList.add(k.getText());
                tempList.add(k.getText());

            }
        }
        System.out.println("Before Sorting :" + originalList);
        System.out.println("Before Sorting :" + tempList);

        Collections.sort(tempList);
        System.out.println("After sorting :" + tempList);

        if (originalList.equals(tempList)) {

            System.out.println("sorted!!");
        } else {
            System.out.println("Not sorted!!");
        }


    }
}