package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.apache.commons.lang3.StringUtils;

public class HtmlUnitDriverConcept {
    static WebDriver driver;
    public static void main(String[] args) {

        //For HtmlUnitDriver we add maven dependency as below:
        //1.  <dependency>
        //          <groupId>org.seleniumhq.selenium</groupId>
        //          <artifactId>htmlunit-driver</artifactId>
        //          <version>4.13.0</version>
        //      </dependency>
        //2. <dependency>
        //          <groupId>org.apache.commons</groupId>
        //          <artifactId>commons-lang3</artifactId>
        //          <version>3.12.0</version>
        //      </dependency>
        //Advantages:
        //1.Testing is happening behind the seen - no browser is launched
        //2. Execution of test cases is fast
        //3. Not suitable for Action class - user action mouse movement, double click, drag and drop
        //4. It is also called ghost Driver - Headless Browser
             //HtmlUnitDriver - Java
             //FantomJS - JavaScript

        driver = new HtmlUnitDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
