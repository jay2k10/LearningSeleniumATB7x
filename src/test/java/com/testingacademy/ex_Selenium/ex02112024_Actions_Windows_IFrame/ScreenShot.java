package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ScreenShot {
    @Test
    void screenShotGoogle() throws IOException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        //Take ScreenShot

        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot,new File("E:\\JMETER\\Google.png"));

        //List<WebElement> e = driver.findElements(By.xpath(""));
    }
}
