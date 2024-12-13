package com.testingacademy.ex_Selenium.ex_26102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium33 {
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void testVwoLoginNegative(){
        // How to find the elements
        // Selenium
        // ID, NAME, CLASS NAME, TAGName,
        // Advance -> Css Selector, Xpath


        // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        // FindElement -> 1 element first web element
        // FindElements -> which can find multiple web elements


        WebDriver driver = new EdgeDriver(edgeOptions);
        //driver.manage().window().maximize();
        //driver.get("https://app.vwo.com");
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        WebElement user_id = driver.findElement(By.xpath("//input[@id ='login-username']"));
        user_id.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.xpath("//input[@id ='login-password']"));
        password.sendKeys("password@321");

        WebElement remember_me_check_box = driver.findElement(By.xpath("//span[@class='checkbox-radio-button ng-scope']"));
        remember_me_check_box.click();

        WebElement submit_button = driver.findElement(By.xpath("//button[@id='js-login-btn']"));
        submit_button.click();

       /* try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        WebElement error_message = driver.findElement(By.xpath("//div[@id='js-notification-box-msg']"));

        //Condition

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(error_message));
        //        wait.until(ExpectedConditions.elementToBeClickable())
        // checkVisibilityOfAndTextToBePresentInElement(driver,)

        wait.until((ExpectedConditions.textToBePresentInElement(error_message, "Your email, password, IP address or location did not match")));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
        //WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.quit();


    }
}
