package com.testingacademy.ex_Selenium.ex02112024_Actions_Windows_IFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;

public class OpenNewTab {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Open a new tab using JavascriptExecutor
        ((JavascriptExecutor) driver).executeScript("window.open()");

        // Switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // Navigate to a different URL in the new tab
        driver.get("https://www.selenium.dev");

        // Switch back to the original tab
        driver.switchTo().window(tabs.get(0));

        // Close the browser
        driver.quit();
    }
}
