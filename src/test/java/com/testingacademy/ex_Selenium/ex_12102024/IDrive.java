package com.testingacademy.ex_Selenium.ex_12102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IDrive {

    @Description("signup in idrive")
    @Test
    public void accountExpire() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.idrive360.com/enterprise/login");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement click_signup = driver.findElement(By.xpath("//a[text()='Create new account']"));
        click_signup.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement first_name = driver.findElement(By.xpath("//input[@id='fname']"));
        first_name.sendKeys("Jay");
        WebElement last_name = driver.findElement(By.xpath("//input[@id='lname']"));
        last_name.sendKeys("Shankar");
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("7777777@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("P@ssword");
        WebElement cName = driver.findElement(By.xpath("//input[@id='cname']"));
        cName.sendKeys("abc software solutions private limited");
        WebElement countryMobileCode = driver.findElement(By.xpath("//div[@class='iti-arrow']"));
        countryMobileCode.click();
        WebElement selectCountryCode = driver.findElement(By.xpath("//span[contains(text(),'India (भारत)')]"));
        selectCountryCode.click();
        WebElement mobile_NO = driver.findElement(By.xpath("//input[@id = 'telnumSignup']"));
        mobile_NO.sendKeys("7480811200");
        WebElement createAccount = driver.findElement(By.xpath("//button[@id = 'frm-btn']"));
        createAccount.click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Error_Message = driver.findElement(By.xpath("//span[text()='Your free trial expires in']"));
        String message = Error_Message.getText();
        System.out.println(message);
        Assert.assertEquals(message,"Your free trial expires in\n" +
                "7 DAYS");
        driver.quit();


    }
}
