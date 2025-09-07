package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JSExecutorgeneric extends JavaScriptUtil{
    public JSExecutorgeneric(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement input = driver.findElement(By.xpath("//input[@id='name']"));
        JSExecutorgeneric abc = new JSExecutorgeneric(driver);
//        addBorderLine(input,driver);
//        scrollIntoView(input,driver);
//        clickOnElement(input, driver);
//        getURL(driver);
//        getTitle(driver);
//        sendValue(driver);
//        getValue(driver);
//        Thread.sleep(5000);
//        refreshBrowser(driver);
//        click(driver);
//        JavaScriptUtil js = new JavaScriptUtil(driver);
        String  page= getPageTitle().toString();
        System.out.println(page);

    }

    public static void clickOnElement(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void scrollIntoView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public static void addBorderLine(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='5px solid red'", element);
    }

    public static void getURL(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = js.executeScript("return document.URL;").toString(); // get page URL
        System.out.println("URL of this page is:" + url);

    }

    public static void getTitle(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = js.executeScript("return document.title;").toString(); // get page title
        System.out.println("Title of this page is :" + title);
    }

    public static void sendValue(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#name').value='Jay Shankar';"); // Send the value
    }

    public static void getValue(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String getinputVaue = js.executeScript("return document.querySelector('#name').value;").toString();
        System.out.println("Input value is :" + getinputVaue); // get the value
    }

    public static void refreshBrowser(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go(0);");  //Refresh the browser
    }

    public static void click(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#opentab').click();");  //click on element
    }

}