package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MultipleWindowMouseHowerClick {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://paytm.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement business = driver.findElement(By.xpath("//li[text()='Paytm for Business']"));

        Actions action = new Actions(driver);
        action.moveToElement(business).build().perform();
        WebElement online = driver.findElement(By.xpath("(//div[@class='_3aL54']/descendant::a[text()='Online Payments'])[2]"));
        action.moveToElement(online).build().perform();
        WebElement target = driver.findElement(By.xpath("//div[@class='_3aL54']/descendant::a[text()='Payment Gateway']"));
        action.moveToElement(target).click().build().perform();

    }
}
