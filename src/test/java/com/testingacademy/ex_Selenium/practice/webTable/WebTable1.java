package com.testingacademy.ex_Selenium.practice.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class WebTable1 {
    static WebDriver driver;

    public static void main(String[] args) {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        List<WebElement> row = driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr"));
        int size = row.size();
        System.out.println(size);
        List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr//th"));
        int size1 = cols.size();
        System.out.println(size1);

        for (int i = 1; i <=1 ; i++) {
            for (int j = 1; j <=size1 ; j++) {
                String TableHead = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+i+"]//th["+j+"]")).getText();
                System.out.print(TableHead+" ");

            }
            System.out.println();

        }

        for (int i = 1; i <size ; i++) {
            for (int j = 1; j <=size1 ; j++) {
                String table = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+i+"]//td["+j+"]")).getText();
                System.out.print(table+" ");


            }
            System.out.println();

        }


    }
}
