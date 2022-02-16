package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.yahoo.com/");

        WebElement newsLink = driver.findElement(By.linkText(" News   "));
        newsLink.click();

        Thread.sleep(2000);



        driver.close();

    }
}
