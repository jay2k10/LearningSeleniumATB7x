package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MultipleWindowMouseHowerClick1 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));

        Actions act = new Actions(driver);
        act.moveToElement(fashion).build().perform();
        WebElement kids = driver.findElement(By.xpath("//div[@class= '_16rZTH']/descendant::a[text()='Kids']"));
        act.moveToElement(kids).build().perform();
        WebElement boys = driver.findElement(By.xpath("//div[@class= '_31z7R_']/descendant::a[text()='Boys & Girls Trackpants']"));
        String text = boys.getText();
        System.out.println("Text should be:"+text);
        if(text.equals("Boys & Girls Trackpants")) {
            act.moveToElement(boys).click().build().perform();
        }else{
            System.out.println( "text not match");
        }

    }
}
