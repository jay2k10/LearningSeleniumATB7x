package com.testingacademy.ex_Selenium.ex_27102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium39_SVG_P1 {
    EdgeDriver driver;

    @BeforeTest
    public void open_browser(){
        //WebDriver driver= new EdgeDriver();
        //driver.manage().window().maximize();
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }
    @Description("Open flipkart and click on serch icon to search macmini")
    @Test
    public void click_on_search(){
        //WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        //String url = "https://www.flipkart.com/";
        //driver.get(url);
        driver.get("https://www.flipkart.com/");
        WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
        search.sendKeys("macmini");
        List<WebElement> svg = driver.findElements(By.xpath("//*[name()='svg']"));
        svg.get(0).click();
        List<WebElement> title = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
        for(WebElement Titles : title ){
            System.out.println(Titles.getText());
        }
        List<WebElement> click_first_item = driver.findElements(By.xpath("//a[@class=\"wjcEIp\"]"));
        click_first_item.get(0).click();
    }

    @AfterTest
    public void close_browser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.quit();
    }
}
