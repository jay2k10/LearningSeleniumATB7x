package com.testingacademy.ex_Selenium.ex_12102024;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Katalon {
    @Description("This is my 1st test case")
    @Test
    @Owner("Jay Shankar")
    public void testPage() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        //Assert.assertEquals(driver.getPageSource(),"Make Appointment");

        WebElement webElement = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        if (webElement.isDisplayed()) {
            System.out.println("Make Appointment button is Present");
        } else {
            System.out.println("Make Appointment button is not present");
        }
        String pageSource = driver.getPageSource();   //after loading some url through driver.get()
        boolean result = pageSource.contains("CURA Healthcare Service");
        if (result == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        driver.quit();
    }
}
