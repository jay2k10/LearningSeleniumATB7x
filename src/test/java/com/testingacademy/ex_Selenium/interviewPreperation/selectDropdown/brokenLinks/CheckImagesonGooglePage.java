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

public class CheckImagesonGooglePage {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

       List<WebElement> imageLink = driver.findElements(By.tagName("img"));
       int size = imageLink.size();
        System.out.println("Total image tag is: "+size);

        for(WebElement images :imageLink){
            String imageUrl = images.getAttribute("src");

            URL newobj = new URL(imageUrl);
            HttpsURLConnection connection = (HttpsURLConnection)newobj.openConnection();
            connection.connect();

            if(connection.getResponseCode()==200){
                System.out.println(imageUrl+" - "+"Ok");
            }else{
                System.out.println(imageUrl+" - "+"Broken");
            }
        }

    }
}
