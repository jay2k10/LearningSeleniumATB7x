package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@name ='BookTable']"));

        int rows = driver.findElements(By.xpath("//table[@name ='BookTable']//tr")).size();
        int cols = driver.findElements(By.xpath("//table[@name ='BookTable']//th")).size();

        //System.out.println("BookName" + " " + "Author" + " " + "Subject" + " " + "Price");
        //for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                String tableData = driver.findElement(By.xpath("//table[@name ='BookTable']//tr[1]//th[" + c + "]")).getText();
                System.out.print(tableData+ " ");
                //System.out.println( );

            //}
          //  System.out.println();
        }
        for (int r = 2; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                String tableData = driver.findElement(By.xpath("//table[@name ='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.println(tableData+ " ");

            }
           System.out.println();
        }

    }
}
