package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Window {


    public void handle(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("");

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        Set<String> childWindow = driver.getWindowHandles();
        System.out.println(childWindow);

        Iterator<String> itr = childWindow.iterator();
        while (itr.hasNext()){
            String ch = itr.next();
            if(!ch.equals(parentWindow)){
                driver.switchTo().window(ch);
                System.out.println(driver.switchTo().window(ch).getTitle());
                driver.navigate().refresh();
            }

        }
    }

}
