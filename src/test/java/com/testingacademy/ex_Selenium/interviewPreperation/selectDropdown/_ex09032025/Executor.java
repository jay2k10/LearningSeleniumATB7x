package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown._ex09032025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Executor {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> allCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size =allCheckbox.size();
        System.out.println(size);

        for (int i = 0; i <size ; i++) {
            if (i < 2) {
                allCheckbox.get(i).click();

            }
        }
    }
}
