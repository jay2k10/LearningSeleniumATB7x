package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class _16032025 {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2017/");

        driver.findElement(By.xpath("//a[text()=' Click here for Google ']")).click();
        driver.findElement(By.xpath("//a[text()=' Click here for Facebook ']")).click();
        driver.findElement(By.xpath("//a[text()=' Click here for Gmail ']")).click();
        String parent = driver.getWindowHandle();
        Set<String> child = driver.getWindowHandles();
        ArrayList<String> list = new ArrayList<>(child);
//        if(switchToRightWindow("Facebook",list)){
//            System.out.println(driver.getTitle());
//
//        }
//        switchToParent(parent);
        closeAllExceptParent(parent,list);
    }
    public static void closeAllExceptParent(String parentid , List<String> list){
        for(String all :list){
            if(!all.equalsIgnoreCase(parentid)){
                driver.switchTo().window(all).close();
            }
        }
    }
    public static void switchToParent(String parentId){
        driver.switchTo().window(parentId);
    }

    public static boolean switchToRightWindow(String windowTitle, List<String> list) {
        for (String all : list) {
            String title = driver.switchTo().window(all).getTitle();
            if (title.contains(windowTitle)){
                System.out.println("I am in a right window");
                return  true;
            }
        }
        System.out.println("not in a right window");
        return false;

    }
}




