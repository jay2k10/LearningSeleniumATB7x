package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GenericWindow {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2017/");

        driver.findElement(By.xpath("//a[text()=' Click here for Google ']")).click();
        driver.findElement(By.xpath("//a[text()=' Click here for Facebook ']")).click();
        driver.findElement(By.xpath("//a[text()=' Click here for Gmail ']")).click();

        String parent = driver.getWindowHandle();
        Set<String> childWindow = driver.getWindowHandles();

        ArrayList<String> list = new ArrayList(childWindow);
        if(switchToRightWindow("Facebook",list)) {
            System.out.println(driver.getTitle());
               }
        switchToParentWindow(parent);
        //closeAllWindowExceptParent(parent,list);


    }
    public static void closeAllWindowExceptParent(String perentId, ArrayList<String> list){
        for(String ids : list){
            if(!ids.equalsIgnoreCase(perentId)){
                driver.switchTo().window(ids).close();
            }
        }

    }
    public static void switchToParentWindow(String perentWindow){
        driver.switchTo().window(perentWindow);

    }

    public static boolean switchToRightWindow(String windowTitle, ArrayList<String> list) {
        for (String allWindow : list) {
            String title = driver.switchTo().window(allWindow).getTitle();
            if(title.contains(windowTitle)){
                System.out.println("i am in a right window !!");
                return true;
            }
        }
        System.out.println("Not a right window");
        return false;

    }

}
