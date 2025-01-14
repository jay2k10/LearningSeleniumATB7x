package com.testingacademy.ex_Selenium.ex_27102024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
    WebDriver driver;
    @Test
    public void web_Table_Orange(){

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement user_Name = driver.findElement(By.xpath("//input[@name='username']"));
        user_Name.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Hacker@4321");
        WebElement login_Click = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']"));
        login_Click.click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement scroll_To_View= driver.findElement(By.xpath("//div[@class='orangehrm-container']"));

        //js.executeScript("window.scrollBy(0,500)");
        js.executeScript("arguments[0].scrollIntoView(true)",scroll_To_View);
       /* try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        int row = driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']")).size();
        int col = driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable'][1]/div")).size();
        System.out.println(row);
        System.out.println(col);
        String first_part = "//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable'][";
        String second_part = "]/div[";
        String third_Part ="]";


        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                String dynamic_Xpath = first_part + i + second_part + j + third_Part;
                System.out.println(dynamic_Xpath);
               // String cell_Xpath = "//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']["+i+"] [//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable'][1]/div ["+j+"]";
                if(dynamic_Xpath.contains("Terminated")){
                    driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
                }

            }

        }







    }
}
