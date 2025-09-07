package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadpopup {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://html.com/input-type-file/");
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(By.xpath("//input[@name = 'fileupload']")).sendKeys("C:\\Users\\Naman\\OneDrive\\Desktop\\jay.html");
        //in that case, never click on the browse button only find the xpath and send the
        // file which you want to upload.
        //it only works if file = type is available in HTML tag

    }
}
