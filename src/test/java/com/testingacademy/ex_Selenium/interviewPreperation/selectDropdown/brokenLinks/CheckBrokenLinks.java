package com.testingacademy.ex_Selenium.interviewPreperation.selectDropdown.brokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class CheckBrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> links = driver.findElements(By.xpath("//*[local-name() ='a']"));
        int sizeOfLinks = links.size();
        System.out.println("Total Links on this page is: " + sizeOfLinks);

        for (WebElement link : links) {
            String linkURL = link.getAttribute("href"); // String url

            URL url = new URL(linkURL); //convert string url to http url
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.connect();
            if(conn.getResponseCode()!=200){
                System.out.println(link.getAttribute("href") +" - "+"Broken Link");
            }else{
                System.out.println(link.getAttribute("href") +" - "+"Not a broken link");
            }

        }
    }
}
