package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlePopup {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://google.com");
        WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
        gmail.click();
        //1. alerts - JavaScript popup - (Alert API - accept(),dismiss())
        //2. File upload popup - Browse Button (type = file , sendKeys(path))
        //3. Browser window popup - Advertisement popup (Window Handler API, getWindowHandles())

        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> child = windows.iterator();
        while (child.hasNext()){
            String childWindow = child.next();

            if(!childWindow.equals(parent)){
               driver.switchTo().window(childWindow).getTitle();


            }
            driver.close();
        }
    }
}