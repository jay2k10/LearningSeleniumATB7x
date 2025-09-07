package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorConcept {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement button = driver.findElement(By.xpath("//a[@class='gb_Ua gb_zd gb_qd gb_hd']"));
        flash(button, driver); // Highlight the button
        drawBorder(button, driver); // draw border
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Naman\\IdeaProjects\\LearningSeleniumATB7x\\src\\test\\java\\com\\testingacademy\\ex_Selenium\\interviewPreperation\\selectDropdown\\naveenAutomation\\element.png"));
        generateAlert(driver, "Some problem on this page!!");

        Alert alert = driver.switchTo().alert();
        alert.accept();
        clickElementByJS(driver,button);
        refreshBrowerbyJS(driver);
        getTitle(driver);
        getPageInnerText(driver);
        pageScrollDown(driver);


    }

    public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgcolor = element.getCssValue("backgroundcolor");
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(300,0,0)", element, driver);
            changeColor(bgcolor, element, driver);
        }
    }

    public static void changeColor(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
        }

    }

    public static void drawBorder(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '3px solid red'", element);

    }

    public static void generateAlert(WebDriver driver, String message) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('" + message + "')");

    }

    public static void clickElementByJS(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

    }

    public static void refreshBrowerbyJS(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go[0]");

    }

    public static String getTitle(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = js.executeScript("return document.title;").toString();
        return title;

    }

    public static String getPageInnerText(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String pageText = js.executeScript("return document.documentElement.innerText;").toString();
        return pageText;
    }
    public static void pageScrollDown(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
}
