package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class WaitConcept {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https//half.ebay.com");
        //Dynamic wait-if an element present in 2 sec, then it moves to the next element, and 38 sec will be ignored.
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // Wait to load the full page
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS); // Global wait to load all element
    }
}