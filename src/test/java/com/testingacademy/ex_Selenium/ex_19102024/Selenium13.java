package com.testingacademy.ex_Selenium.ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium13 {
    @Description("Verify that Account registration is successful")
    @Test
    public void createAccount(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        //Enter first name
        WebElement firstname = driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("Jay");
        //Enter last name
        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Shankar");
        //Enter Emailid
        WebElement emailid = driver.findElement(By.id("input-email"));
        emailid.sendKeys("jayshankarprasad2k10@yopmail.com");
        //Enter Telephone
        WebElement phone = driver.findElement(By.id("input-telephone"));
        phone.sendKeys("7480811200");
        //Enter password
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("P@ssword");
        //Enter cnfpassword
        WebElement cnfpassword = driver.findElement(By.id("input-confirm"));
        cnfpassword.sendKeys("P@ssword");
        //privacy policy
        WebElement privacy = driver.findElement(By.name("agree"));
        privacy.click();
        //click on continue
        WebElement clickoncontinue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        clickoncontinue.click();
        // verify test - Your Account Has Been Created!
        WebElement accountCreate = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        System.out.println(accountCreate.getText());
        Assert.assertEquals(accountCreate.getText(),"Your Account Has Been Created!");
        //Click on continue button
        WebElement submit2 = driver.findElement(By.linkText("Continue"));
        submit2.click();
        //Verify My Orders text on page
        WebElement myOrders = driver.findElement(By.xpath("//*[@id=\"content\"]/h2[2]"));
        System.out.println(myOrders.getText());
        Assert.assertEquals(myOrders.getText(),"My Orders");
        driver.quit();








    }
}
