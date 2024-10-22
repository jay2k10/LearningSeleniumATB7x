package com.testingacademy.ex_Selenium.ex_19102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium15 {
    @Test

    public void vwoLogin(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
