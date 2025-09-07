package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class SwitchBetweenWindows {
    static WebDriver driver;

    @Test
    public void window() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        //Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String parentWindowId = driver.getWindowHandle();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")));

        WebElement linkedin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]"));
        linkedin.click();
        WebElement facebook = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]"));
        facebook.click();
        WebElement twitter = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]"));
        twitter.click();
        WebElement youTube = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]"));
        youTube.click();

        Set<String> handles = driver.getWindowHandles();
        List<String> hList = new ArrayList(handles);

        if (switchToRightWindow("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook", hList)) {
            System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
        }
        switchToParentWindow(parentWindowId);
        System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());

        closeAllWindows(hList,parentWindowId);
        switchToParentWindow(parentWindowId);
        System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());

    }
    public static void closeAllWindows(List<String> hList ,String parentWindowId){
        for(String e :hList){
            if(!e.equals(parentWindowId)){
                driver.switchTo().window(e).close();
            }
        }
    }

    public static void switchToParentWindow(String parentWindowId) {
        driver.switchTo().window(parentWindowId);

    }

    public static boolean switchToRightWindow(String windowTitle, List<String> hList) {
        for (String e : hList) {
            //System.out.println(e);
            String title = driver.switchTo().window(e).getTitle();
            //System.out.println(title);
            if (title.contains(windowTitle)) {
                System.out.println("In right window!!");
                return true;
            }
        }
        return false;

    }


}

