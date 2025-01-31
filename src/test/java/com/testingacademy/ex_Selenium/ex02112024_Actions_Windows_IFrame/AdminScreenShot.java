package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AdminScreenShot {

    @Test
    void adminScren() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        String A = driver.getTitle();
        System.out.println("Title is :" +A);

        File gs_Shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(gs_Shot, new File("E:\\JMETER\\Google.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        driver.get("https://e-compliance.in/Admin/login.htm");
        String s = driver.getCurrentUrl();
        System.out.println("Current URL is : "+s);
        //String s2 = driver.getPageSource();
        //System.out.println("Page source is "+s2);
        List<WebElement> list = driver.findElements(By.tagName("link"));
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).getText());

        }

        //Taking Screenshot
        File screeShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //save file
        try {
            FileUtils.copyFile(screeShot, new File("E:\\JMETER\\Admin.jpg"));
        } catch (IOException e) {
            System.out.println("Destination not found!!");
        }

        driver.quit();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        File screenShot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot2,new File("D://A.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
