package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PopupHandle {
    static WebDriver driver;
    public static void main(String[] args) {

        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        driver.findElement(By.xpath("//button[text()='Log In']")).click();

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Displayed popup text is : "+text);
        if(text.equals("Please enter a valid user name")){
            System.out.println("Correct message");
            alert.accept();  // Click on the Ok button.
        }else{
            System.out.println("in correct message");
        }

        //alert.dismiss(); //click on the cancel button


    }
}
