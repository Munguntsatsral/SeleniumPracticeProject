package com.cydeo.tests.day1_selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDryRun { public static void main(String[] args) {

    //"C:\Users\milan\Downloads\chromedriver_win32 (1).zip"
    // 1.set up chrome driver
    // System.setProperties("webdriver.chrome.driver", "\Users\milan\Downloads\chromedriver");
    WebDriverManager.chromedriver().setup();

    // 2. create web driver instance

    WebDriver driver = new ChromeDriver();

    //3. navigate to https://google.com
    driver.get("https://google.com");
}
}
