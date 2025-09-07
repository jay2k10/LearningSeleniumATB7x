package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.checkBoxes1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class SelectAllCheck {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> options = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
        int size = options.size();

        for (WebElement checkAllCheckBoxes : options) {
            String name = checkAllCheckBoxes.getAttribute("name");
            if (name.equals("checkBoxOption3")){
                checkAllCheckBoxes.click();

            }
        }

    }
}
