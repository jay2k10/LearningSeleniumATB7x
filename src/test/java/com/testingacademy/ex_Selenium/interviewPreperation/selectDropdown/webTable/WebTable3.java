package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTable3 {
    static WebDriver driver;

    @Test
    public void WebTableDataPrint() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");

        int rows = driver.findElements(By.xpath("//table[@id = 'customers']//tr")).size();
        System.out.println(rows);
        int cols = driver.findElements(By.xpath("//table[@id = 'customers']//tr[2]/td")).size();
        System.out.println(cols);

        for (int r = 2; r <=rows; r++) {
            for (int i = 1; i <=cols; i++) {
                String tableData = driver.findElement(By.xpath("//table[@id = 'customers']//tr["+r+"]/td["+i+"]")).getText();
                System.out.println(tableData);

            }

        }

    }
}
