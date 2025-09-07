package com.testingacademy.ex_Selenium.listeners;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2 {
    @Test(retryAnalyzer = Analyser.RetryAnalyzer.class)
    public void m1(){
        Assert.assertTrue(false);
    }
}
