package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Gmail {
    public static void main(String[] args) {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        driver.findElement(By.xpath("(//a[@class='AVAq4d TrZEUc'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='AVAq4d TrZEUc'])[2]")).click();
        driver.findElement(By.xpath("(//a[@class='AVAq4d TrZEUc'])[3]")).click();
        String parent = driver.getWindowHandle();
        System.out.println(parent);

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> its = handles.iterator();
        while(its.hasNext()) {
            String child = its.next();
            String title = driver.switchTo().window(child).getTitle();
            System.out.println(title);
            if(title.equals("Google Terms of Service – Privacy & Terms – Google")){
                //System.out.println("i am in a right window");
                break;
            }
        }
    }
}
