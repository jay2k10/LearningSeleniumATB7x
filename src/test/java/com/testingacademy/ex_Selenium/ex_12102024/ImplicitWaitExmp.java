package com.testingacademy.ex_Selenium.ex_12102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWaitExmp {

    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass input box** and enter password as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"


    @Description("Verify the error message og app.vwo.com")
    @Test
    public void testVWOLoginNegative() {

        // How to find the elements
        // Selenium
        // ID, NAME, CLASS NAME, TAGName,
        // Advance -> Css Selector, Xpath


        // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximize");

        // FindElement -> 1 element first web element
        // FindElements -> which can find multiple web elements

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        // 1. Find the email input box and enter the email

        WebElement emailInputbox = driver.findElement(By.id("login-username"));
        emailInputbox.sendKeys("admin@admin.com");

        WebElement passwordInputbox = driver.findElement(By.name("password"));
        passwordInputbox.sendKeys("password@321");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        // After 3 seconds error comes

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.textToBePresentInElement(errorMessage,"Your email, password, IP address or location did not match"));
        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");
        driver.quit();

    }
}
