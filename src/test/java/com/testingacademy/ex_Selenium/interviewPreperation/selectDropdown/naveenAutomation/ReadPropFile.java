package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Naman\\IdeaProjects\\LearningSeleniumATB7x\\src\\test\\java\\com\\testingacademy\\ex_Selenium\\interviewPreperation\\selectDropdown\\naveenAutomation\\config.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));
        String url = prop.getProperty("URL");
        System.out.println("URL is :" + url);
        String browserName = prop.getProperty("browser");
        System.out.println("Browser name is :" + browserName);

        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath(prop.getProperty("userName_Xpath"))).sendKeys(prop.getProperty("userName"));
        driver.findElement(By.xpath(prop.getProperty("password_Xpath"))).sendKeys(prop.getProperty("password"));

    }
}
