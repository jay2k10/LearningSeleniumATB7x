package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class WindowPractice {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2017/");

        driver.findElement(By.xpath("//a[text()=' Click here for Google ']")).click();
        driver.findElement(By.xpath("//a[text()=' Click here for Facebook ']")).click();
        driver.findElement(By.xpath("//a[text()=' Click here for Gmail ']")).click();

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        Set<String> childWindow = driver.getWindowHandles();
        //ArrayList list = new ArrayList(childWindow);
        for (String handles : childWindow) {
            String title = driver.switchTo().window(handles).getTitle();
            System.out.println(title);
            assert title != null;
            if (title.contains("Google")) {
                driver.switchTo().window(handles);
                break;
            }
        }
    }
}
