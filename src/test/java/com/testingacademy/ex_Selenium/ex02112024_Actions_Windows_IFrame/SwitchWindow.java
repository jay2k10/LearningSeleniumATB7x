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
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {

    @Test
    public void window() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().deleteAllCookies();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        //Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")));

        WebElement linkedin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]"));
        linkedin.click();
        WebElement facebook = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]"));
        facebook.click();
        WebElement twitter = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]"));
        twitter.click();
        WebElement youTube = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]"));
        youTube.click();

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        Set<String> handels = driver.getWindowHandles();
        System.out.println(handels);
        //Iterator<String> itr = handels.iterator();
//        while (itr.hasNext()) {
//            String childWindow = itr.next();
//            if (!parentWindow.equals(childWindow)) {
//                driver.switchTo().window(childWindow);
//                System.out.println(driver.switchTo().window(childWindow).getTitle());
//            }
//        }
       //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(2000));
//        wait1.until(ExpectedConditions.alertIsPresent());


        for(String windowHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(windowHandle);
        }
    }
}
