package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class GoogleSearchDynamicTest {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("testing");
        List<WebElement> option = driver.findElements(By.xpath("//ul[contains(@class,'G4')]//li/descendant::div[contains(@class,'wM')]"));
        System.out.println("Total no of options is: " + option.size());
        for (int i = 0;i< option.size();i++) {
            System.out.println(option.get(i).getText());

            if(option.get(i).getText().contains("testing interview questions")){
                option.get(i).click();
                break;
            }

        }
    }
}
