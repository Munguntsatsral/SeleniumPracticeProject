package com.cydeo.tests.day1_selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //do setup for browser driver.
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver  driver = new ChromeDriver();

        // make full screen
        driver.manage().window().fullscreen();

        //2.Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");


        //Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos

        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual title comes from th browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected, Verification passed!");
        } else{
            System.out.println("Title is not as expected, Verification failed!");
        }


    }
}
