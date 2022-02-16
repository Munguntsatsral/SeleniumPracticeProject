package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC4_FindElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//?????
        driver.get("https://practice.cydeo.com/abtest");

        List <WebElement> allLinks = driver.findElements(By.tagName("a")); //shortcut ?????.

        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement each: allLinks) {
            System.out.println("Text of link: " + each.getText());

            System.out.println("Href value: " + each.getAttribute("href"));
        }

        driver.close();


       /*WebElement link1 = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        WebElement link2 = driver.findElement(By.xpath("//a[@class='nav-link']"));

        String link1Text = link1.getText();
        String link2Text = link2.getText();

        System.out.println("link1Text = " + link1Text);
        System.out.println("link2Text = " + link2Text);/*

        */


    }
}
/*
TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */