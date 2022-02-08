package com.cydeo.tests.day2_locators_getText_getAttitude.task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://login1.nextbasecrm.com/");

            String actualRememberMeLabel = driver.findElement(By.className("login-item-checkbox-label")).getText();
            String expectedRememberMeLabel = "Remember me on this computer";

            if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
                System.out.println("Remember Me Label Text Verification PASSED");
            }else {
                System.out.println("Remember Me Label Text Verification FAILED");
            }



            String actualForgotYourPasswordText = driver.findElement(By.className("login-link-forgot-pass")).getText();
            String expectedForgotYourPasswordText = "FORGOT YOUR PASSWORD?";

            if (actualForgotYourPasswordText.equals(expectedForgotYourPasswordText)){
                System.out.println("Forgot Your Password Link Text Verification PASSED");
            }else {
                System.out.println("Forgot Your Password Link Text Verification FAILED");
                System.out.println(actualForgotYourPasswordText);
            }



            String actualHrefText = driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");
            String expectedHrefText = "forgot_password=yes";

            if (actualHrefText.contains(expectedHrefText)){
                System.out.println("Href attribute verification PASSED");
            }else {
                System.out.println("Href attribute verification FAILED");

            }


            driver.quit();

        }
}