package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

        int row = driver.findElements(By.xpath("//table[@id ='customers']//tr")).size();
        int col = driver.findElements(By.xpath("//table[@id ='customers']//th")).size();
        System.out.println(row);
        System.out.println(col);

        for (int i = 2; i < row; i++) {
            for (int j = 1; j <=col; j++) {
               String tableData =driver.findElement(By.xpath("//table[@id ='customers']//tr["+i+"]//td["+j+"]")).getText();
                System.out.println(tableData);

            }

        }
    }
}
