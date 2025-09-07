package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class DynamicWebTableConcept {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://cosmocode.io/automation-practice-webtable/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");


        //table[@id='countries']//tr[2]//td[2]
        //table[@id='countries']//tr[3]//td[2]
        //table[@id='countries']//tr[4]//td[2]
        //table[@id='countries']//tr[5]//td[2]

        String before_xpath = "//table[@id='countries']//tr[";
        String after_xpath = "]//td[2]";
        for (int i = 2; i <= 10; i++) {
            String countryName = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
            System.out.println("Country name is: "+countryName);
        }

    }
}
