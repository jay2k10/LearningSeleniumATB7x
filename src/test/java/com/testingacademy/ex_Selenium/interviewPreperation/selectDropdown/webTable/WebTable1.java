package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
    static WebDriver driver;

    public static void main(String[] args) {
        driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        int rows = driver.findElements(By.xpath("(//table[@id='product'])[2]//tr")).size();
        //int cols = driver.findElements(By.xpath("(//table[@id='product'])[2]//tr//th")).size();
        int cols = driver.findElements(By.xpath("(//table[@id='product'])[2]//tr[1]//td")).size();

        for (int r = 1; r <rows; r++) {
            for (int c = 1; c <=cols ; c++) {
              String tableData =  driver.findElement(By.xpath("(//table[@id='product'])[2]//tr["+r+"]//td["+c+"]")).getText();
                System.out.println(tableData);

            }

        }
    }
}
