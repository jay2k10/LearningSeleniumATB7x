package com.testingacademy.ex_Selenium.ex_27102024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium40_SVG_P2 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Description("Verify that the tripura is in india and click on it.")
    @Test
    public void test_svg_india_search_click() {

        driver.manage().window().maximize();
        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
        driver.manage().window().maximize();
        // local-name() , name()- Xpath (built in)
        // document.querySelectorAll("#login-username"); - JS


        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement div_To_Scroll = driver.findElement(By.xpath("//div[@class='amcharts-chart-div']"));
        js.executeScript("arguments[0].scrollIntoView(true);",div_To_Scroll);

        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']/*[local-name()='g'][7]/*[local-name()='g']/*[local-name()='g']/*[local-name()='path']"));
//        for(WebElement state:states){
//            System.out.println(state.getAttribute("aria-label"));
//            if(state.getAttribute("aria-label").contains("Tripura")){
//                state.click();
//            }
//        }
        for (WebElement States : states) {
            System.out.println(States.getAttribute("aria-label"));
            if (States.getAttribute("aria-label").contains("Tripura")) {
                States.click();
            }
        }


    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}