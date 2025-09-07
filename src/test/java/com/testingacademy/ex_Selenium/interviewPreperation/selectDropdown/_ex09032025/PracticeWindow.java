package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown._ex09032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class PracticeWindow {
    public static void main(String[] args) {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        driver.findElement(By.xpath("(//a[@class='AVAq4d TrZEUc'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='AVAq4d TrZEUc'])[2]")).click();
        driver.findElement(By.xpath("(//a[@class='AVAq4d TrZEUc'])[3]")).click();

        String parent = driver.getWindowHandle();

        Set<String> handles = driver.getWindowHandles();

        for(String hand:handles){
            String title = driver.switchTo().window(hand).getTitle();
            if(title.equals("")){
                driver.switchTo().window(hand);
            }
        }


    }
}
