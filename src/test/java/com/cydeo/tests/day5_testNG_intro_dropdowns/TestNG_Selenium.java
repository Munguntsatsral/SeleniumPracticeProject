package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;
        @BeforeMethod
        public void setupMethod(){
            //Do browser driver setup
            //open browser
            driver = WebDriverFactory.getDriver("chrome");

            //Maximize the page
            driver.manage().window().maximize();

            //Implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @Test
        public void selenium_test(){

        //Get "https://www.google.com/
            driver.get("https://www.google.com/");

        //Assert: title is "Google"
            //Assert.assertEquals(driver.getTitle(), "Google");

            String actual = driver.getTitle();
            String expected = "Google";

            Assert.assertEquals(actual, expected, "Title is not matching");

            driver.close();
    }

}
