package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class ChromeHeadlessOptions {
    static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800"); // if application is compatible with mobile,
        // then it is working without this line of code.
        options.addArguments("headless");  //For headless option, we add this argument.
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
        driver.manage().deleteAllCookies();
        driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
        driver.findElement(By.xpath("//button[@id = 'menu1']")).click();
        List<WebElement> list = driver.findElements(By.xpath("//ul[@aria-labelledby='menu1']//li//a"));
        System.out.println("Size of dropdown value is: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("CSS")) {
                list.get(i).click();
                break;
            }
            driver.switchTo().frame(0);
        }
    }
}
