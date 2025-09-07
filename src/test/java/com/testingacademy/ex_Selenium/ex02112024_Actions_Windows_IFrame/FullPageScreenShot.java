package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FullPageScreenShot {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(1000);

        Shutterbug.shootPage(driver, Capture.FULL,true).save("E:\\JMETER\\HDOR.png");
    }
}
