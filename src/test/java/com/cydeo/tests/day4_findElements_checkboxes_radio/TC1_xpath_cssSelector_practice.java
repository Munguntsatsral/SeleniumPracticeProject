package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_xpath_cssSelector_practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

       WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
      //  WebElement homeLink = driver.findElement(By.cssSelector("a.'nav-link'"));
       // WebElement homeLink = driver.findElement(By.cssSelector("a[href='/']"));

     //   WebElement headerForgotPassword = driver.findElement(By.cssSelector("div>h2"));
      //  WebElement headerForgotPassword = driver.findElement(By.cssSelector("//h2['text']")) ;
   //     WebElement headerForgotPassword = driver.findElement(By.cssSelector("//h2[text()='Forgot Password']")) ;
        WebElement headerForgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']")) ;

        //c. “E-mail” text
        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement e_mailInputBox = driver.findElement(By.xpath("//input[@name='email']"));

        //e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("headerForgotPassword.isDisplayed() = " + headerForgotPassword.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("e_mailInputBox.isDisplayed() = " + e_mailInputBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        Thread.sleep(3000);

        driver.close();


    }
}
/*
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
 */