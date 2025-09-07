package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation.com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }

    @Test(priority = 1, groups = "Title")
    public void getTitle() {
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(title,"Google");
    }

    @Test(priority = 2, groups = "Logo")
    public void googleLogoTest() {
        WebElement logo = driver.findElement(By.xpath("(//*[local-name() = 'svg'])[4]"));
        boolean b = logo.isDisplayed();
        Assert.assertTrue(b);
        Assert.assertEquals(b,true);

    }

    @Test(priority = 3, groups = "Mail")
    public void gmailLink() {
        WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
        boolean b = gmailLink.isDisplayed();
        Assert.assertTrue(b);
    }

    @Test(priority = 4, groups = "test")
    public void test1() {
        System.out.println("Test1");
    }

    @Test(priority = 5, groups = "test")
    public void test2() {
        System.out.println("Test2");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
