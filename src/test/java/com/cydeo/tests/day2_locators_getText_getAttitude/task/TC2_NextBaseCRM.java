package com.cydeo.tests.day2_locators_getText_getAttitude.task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_NextBaseCRM {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        //Expected: Remember me on this computer
        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));
        String actualVerifyRememberMe = rememberMe.getText();

       String expectedRememberMe = "Remember me on this computer";
       if(actualVerifyRememberMe.equals(expectedRememberMe)){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test failed");
        }

       //Expected: Forgot your password?
       WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
       String actualForgotPassword = forgotPassword.getText();

       String expectedForgotPassword = "Forgot your password?";
       if(actualForgotPassword.equals(expectedForgotPassword)){
           System.out.println("Test passed!");
       }else{
           System.out.println("Test failed");
       }

       //Expected: forgot_password=yes
       String actualAttributeHref = driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");
       String expectedAttribute = "forgot_password=yes";

       // System.out.println(actualAttribute);

       if(actualAttributeHref.contains(expectedAttribute)){
           System.out.println("Test passed!");
       } else{
           System.out.println("Test failed");
       }

       driver.close();

    }
}
/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes

PS: Inspect and decide which locator you should be using to locate web
elements.
 */