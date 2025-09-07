package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TextNotPresentOnGooglePage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
        String text = driver.getPageSource();
        if (text.contains("Ajay")) {
            System.out.println("Text is present on the page");
        } else {
            System.out.println("Text is not present on the page");
        }
        driver.quit();
    }
}
