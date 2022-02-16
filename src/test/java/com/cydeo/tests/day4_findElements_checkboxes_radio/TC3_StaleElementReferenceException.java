package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3_StaleElementReferenceException {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/abtest");

        WebElement cydeoLink = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        System.out.println("cydeoLink.isDisplayed()= "+ cydeoLink.isDisplayed());

        driver.navigate().refresh();

        cydeoLink = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        System.out.println("cydeoLink.isDisplayed()= "+ cydeoLink.isDisplayed());

        driver.close();

    }
}
/*

TC #6: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.



This is a simple StaleElementReferenceException to understand what is
this exception and how to handle it.
 */