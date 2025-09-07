package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastDropdownoption {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        int selectoptions = select.getOptions().size();
        System.out.println(selectoptions);
        select.selectByIndex(selectoptions - 3);
        //driver.close();

    }
}
