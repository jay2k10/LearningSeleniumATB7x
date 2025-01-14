package com.testingacademy.ex_Selenium.ex_27102024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTable_Practice {
    WebDriver driver;

    @Test
    public void Web_Table() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(col);

        String first_Part = "//table[@id='customers']/tbody/tr[";
        String second_Part = "]/td[";
        String third_Part = "]";

        for (int i = 2; i < row; i++) {
            for (int j = 1; j < col; j++) {
                String dynamic_Xpath = first_Part + i + second_Part + j + third_Part;
                String data = driver.findElement(By.xpath(dynamic_Xpath)).getText();

                if(data.contains("Helen Bennett")){
                    String country_path= dynamic_Xpath+"/following-sibling::td";
                    String company_path= dynamic_Xpath+"/preceding-sibling::td";

                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    String company_text = driver.findElement(By.xpath(company_path)).getText();
                    System.out.println(country_text);
                    System.out.println(company_text);


                }



            }

        }
    }
}
