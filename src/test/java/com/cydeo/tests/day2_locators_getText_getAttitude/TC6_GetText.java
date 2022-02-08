package com.cydeo.tests.day2_locators_getText_getAttitude;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6_GetText { public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://practice.cydeo.com/registration_form");

    //  3- Verify header text is as expected:
    WebElement headerText = driver.findElement(By.tagName("h2"));

    //Expected: Registration form

    String expectedHeaderText ="Registration form";
    String actualHeaderText = headerText.getText();

    if(actualHeaderText.equals(expectedHeaderText)){
        System.out.println("Header text verification is passed!");
    } else{
        System.out.println("Header text verification is failed!");
    }

    //4- Locate “First name” input box
    WebElement firstName = driver.findElement(By.name("firstname"));


    //5- Verify placeholder attribute’s value is as expected:
    //Expected: first name

    String expectedPLaceHolder = "first name";
    String actualPlaceHolder = firstName.getAttribute("placeholder");

    if(expectedPLaceHolder.equals(actualPlaceHolder)){
        System.out.println("PlaceHolder passed!");
    } else{
        System.out.println("PlaceHolder failed!");
    }

}
}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name
 */