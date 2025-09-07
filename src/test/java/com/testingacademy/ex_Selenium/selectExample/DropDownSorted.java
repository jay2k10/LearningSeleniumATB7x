package com.testingacademy.ex_Selenium.selectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropDownSorted {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        List<WebElement> options = select.getOptions();

        List originalList = new ArrayList();
        List tempList = new ArrayList();

        for (WebElement k : options) {
            if (!k.getText().equals(select)) {
                originalList.add(k.getText());
                tempList.add(k.getText());

            }
        }
        Collections.sort(tempList);

        System.out.println(originalList);
        System.out.println(tempList);

        if (originalList.equals(tempList)) {
            System.out.println("Sorted!!");
        } else {
            System.out.println("Not Sorted !!");
        }


    }
}
