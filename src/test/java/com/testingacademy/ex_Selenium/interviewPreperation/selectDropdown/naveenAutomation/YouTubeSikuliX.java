package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.naveenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.time.Duration;

public class YouTubeSikuliX {
    static WebDriver driver;

    public static void main(String[] args) throws FindFailed {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
        driver.manage().deleteAllCookies();
        driver.get("https://www.youtube.com/watch?v=7tqQ3wDnnnI");

        Screen s = new Screen();
        Pattern pause = new Pattern("pause.png");
        s.wait(pause,3000);
        s.click();
    }
}