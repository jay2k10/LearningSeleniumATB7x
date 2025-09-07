package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.brokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CheckOnGooglePage {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        List<WebElement> links = driver.findElements(By.xpath("//*[local-name() ='a']"));
        int totalLinks = links.size();
        System.out.println("Total Links on this page is: "+totalLinks);

        for(WebElement link :links){
            String url = link.getAttribute("href"); //get all links
            URL newobj = new URL(url); // create URL object
            HttpsURLConnection  connection = (HttpsURLConnection)newobj.openConnection();
            connection.connect();
            if(connection.getResponseCode()==200){
                System.out.println(url+" - "+"Ok");
            }else{
                System.out.println(url+" - "+"Broken Link");
            }
        }
    }
}
