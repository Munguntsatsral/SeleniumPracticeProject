package com.cydeo.tests.day1_selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // 1. set up the "browser driver"

        WebDriverManager.chromedriver().setup();

        // 2. Create instance of the Selenium WedDriver
        // this will open empty browser
        WebDriver driver = new ChromeDriver();

        //3. go to "https://www.tesla.com"
        driver.get("https://tesla.com");

        // get title on the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        Thread.sleep(1000);

        // use selenium to navigate back
        driver.navigate().back();

        Thread.sleep(1000);

        // use selenium to navigate forward
        driver.navigate().forward();

        Thread.sleep(1000);

        // use selenium refresh

        driver.navigate().refresh();

        Thread.sleep(1000);

        // use navigate to "https://www.google.com
        driver.navigate().to("https://www.google.com");

        //get the current title to get google page
        currentTitle= driver.getTitle();


        // get the title of the page
        //  System.out.println("driver.getTitle() = " + driver.getTitle());

        //  String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        // get the current URL using selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        Thread.sleep(3000);

        // this will close currently open window
        driver.close();

        // this will close all open browser
        //  driver.quit();



    }

}

