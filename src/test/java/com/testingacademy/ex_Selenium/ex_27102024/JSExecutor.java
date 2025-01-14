package com.testingacademy.ex_Selenium.ex_27102024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JSExecutor {
    public static void main(String[] args) {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("alert('hello Dear')");
        //js.executeScript("alert(1)");
        WebElement scroll_To_View = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);",scroll_To_View);
    }
}
