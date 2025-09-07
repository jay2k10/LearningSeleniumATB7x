package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation.com.TestNG;

import org.testng.annotations.*;

public class TestNgBasics {

    @BeforeSuite
    public void setUp() {
        System.out.println("Set up system property");
    }

    @BeforeTest
    public void launchBrowser() {
        System.out.println("Launch Chrome Browser");
    }

    @BeforeClass
    public void login() {
        System.out.println("login to app");
    }

    @BeforeMethod
    public void enterURL() {
        System.out.println("Enter URL");
    }

    @Test
    public void googleTitleTest() {
        System.out.println("Google title test");
    }
    @Test
    public void googleTitleTest1() {
        System.out.println("Google title test1");
    }

    @AfterMethod
    public void logOut() {
        System.out.println("Log out from app");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("Close the browser");
    }

    @AfterTest
    public void deleteAllCookie() {
        System.out.println("Delete all cookie");
    }

    @AfterSuite
    public void generateTestReport() {
        System.out.println("Generate Test Report");
    }

}
