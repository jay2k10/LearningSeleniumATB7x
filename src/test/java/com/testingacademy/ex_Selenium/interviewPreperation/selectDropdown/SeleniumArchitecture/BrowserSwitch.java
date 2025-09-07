package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.SeleniumArchitecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class BrowserSwitch {
    public static WebDriver driver;

    public static void main(String[] args) {
        //String browser;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter browser name: ");
        String browser = sc.next();

        switch (browser) {
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.google.com");
                break;
            default:
                System.out.println("Enter the correct browser name:");
                break;

        }

    }
}
