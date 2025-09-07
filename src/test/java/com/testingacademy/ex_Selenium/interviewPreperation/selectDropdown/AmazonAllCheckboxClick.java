package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonAllCheckboxClick {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com/");
        //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        //Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search Amazon']"));
        searchBox.sendKeys("iphone", Keys.ENTER);

        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int checkboxCount = allCheckBoxes.size();

        System.out.println("All checkboxes are :" + checkboxCount);
        WebElement divtoScroll = driver.findElement(By.xpath("//input[@type='checkbox']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", divtoScroll);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));

        for (WebElement checkBox : allCheckBoxes) {
//            String s = checkBox.getAttribute("value");
//            if (s.equals("ABC")) {
//                checkBox.click();
//            }

            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("--------------------"));

        }

    }
}
