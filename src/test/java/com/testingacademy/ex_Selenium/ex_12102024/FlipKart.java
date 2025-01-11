package com.testingacademy.ex_Selenium.ex_12102024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class FlipKart {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

    }


    @Test
    public void searchShoe() {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("shoes");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(search));
        List<WebElement> click = driver.findElements(By.xpath("//*[name()='svg']"));
        click.get(0).click();
        List<WebElement> shoesName = driver.findElements(By.xpath("*//div[@class='syl9yP']"));

//        for (WebElement shoeName:shoesName){
//            System.out.println(shoeName.getText());
//        }
        List<WebElement> price = driver.findElements(By.xpath("*//div[@class='Nx9bqj']"));
//        for(WebElement Price:price){
//            System.out.println(Price.getText());
//        }

        List<WebElement> percentageDiscount = driver.findElements(By.xpath("*//div[@class='UkUFwK']"));
//        for(WebElement PercentageDiscount:percentageDiscount)
//            System.out.println(PercentageDiscount.getText());
        int size = Math.min(shoesName.size(), price.size());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            String stringPrice = price.get(i).getText();
            int lastLengthOfPrice = stringPrice.length();
            String tmpPrice = stringPrice.substring(1, lastLengthOfPrice);
            // remove rupee sign from total price
            System.out.println(tmpPrice);
            String removeComma = tmpPrice.replaceAll(",", "");
            //Remove comma from price
            System.out.println(removeComma);

            int p = Integer.parseInt(removeComma);
            //convert string price to integer price
            System.out.println(p);

            System.out.println("Name of Shoe: " + shoesName.get(i).getText() + "||" + "Price: " + price.get(i).getText());
            //+"||" + "Percentage Discount: " +percentageDiscount.get(i).getText()
            max = Math.max(max, p);
            //max = Math.max(max,Integer.parseInt(price.get(i).getText().substring(1,price.get(i).getText().length()).replaceAll(",","")));

            min = Math.min(min, p);
            //min = Math.max(min,Integer.parseInt(price.get(i).getText().substring(1,price.get(i).getText().length()).replaceAll(",","")));

        }
        System.out.println("Maximum Value is: " + max);
        System.out.println("Minimum Value is: " + min);


    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
