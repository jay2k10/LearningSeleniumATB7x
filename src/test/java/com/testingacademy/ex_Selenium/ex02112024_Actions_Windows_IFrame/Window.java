package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Window {
    public WebDriver driver;

    public void handle(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("");

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        Set<String> childWindow = driver.getWindowHandles();
        System.out.println(childWindow);

        for (String ch : childWindow) {
            if (!ch.equals(parentWindow)) {
                driver.switchTo().window(ch);
                System.out.println(driver.switchTo().window(ch).getTitle());
                driver.navigate().refresh();
            }

        }
    }

}
