package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0); // need this line to switch frame
        Actions action = new Actions(driver);
        WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
        action.dragAndDrop(from,to).build().perform();

    }

}
