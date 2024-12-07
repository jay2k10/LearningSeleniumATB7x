package com.testingacademy.ex_Selenium.ex_20102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium29 {
    @Description("Verify that Free trial expire message in idrve.com")
    @Test
    public void test_verify_expire_message() {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.idrive360.com/enterprise/login");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // driver.manage().window().maximize();

        // <input
        // _ngcontent-qcv-c4=""
        // autofocus=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username"
        // name="username"
        // type="email">

 //       WebElement username_input_id = driver.findElement(By.id("username"));
//        WebElement username_input_xpath = driver.findElement(By.xpath("//input[@id='username']"));
//        WebElement username_input_css_1 = driver.findElement(By.cssSelector("input#username"));
//        WebElement username_input_css_2 = driver.findElement(By.cssSelector("#username"));
//        WebElement username_input_name = driver.findElement(By.name("username"));

        WebElement user_id = driver.findElement(By.xpath("//input[@id='username']"));
        user_id.sendKeys("augtest_040823@idrive.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("123456");
        WebElement remember_me_check_box = driver.findElement(By.xpath("//span[@class='id-checkmark']"));
        remember_me_check_box.click();
        WebElement sign_in = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        sign_in.click();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error_message_free_trial = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        Assert.assertEquals(error_message_free_trial.getText(), "Your free trial has expired");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    }

