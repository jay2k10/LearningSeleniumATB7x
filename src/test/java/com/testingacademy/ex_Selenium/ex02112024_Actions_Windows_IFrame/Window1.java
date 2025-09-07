package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Window1 {
    public WebDriver driver;
    public void windowHandle(){
        driver= new ChromeDriver();
        driver.get("-------------------");
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println("Parent Window Id is: "+parent);

        Set<String> child = driver.getWindowHandles();
        System.out.println("Child Window Id is: "+child);
        //switch to a child window
        for(String ch :child){
            if(!ch.equals(parent)){
                driver.switchTo().window(ch);
            }
        }
        //Switch to a specific window
        for(String ch :child){
            String title=driver.switchTo().window(ch).getTitle();
            assert title != null;
            if (title.equals("Gmail")){
                driver.switchTo().window(ch);
                break;
            }
        }
    }
}
