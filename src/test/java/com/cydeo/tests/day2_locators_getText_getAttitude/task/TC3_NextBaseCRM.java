package com.cydeo.tests.day2_locators_getText_getAttitude.task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_NextBaseCRM {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement logInText = driver.findElement(By.className("login-btn"));
        String actualLogInText = logInText.getAttribute("value");
        String expectedLogInText ="Log In";

        System.out.println(logInText.getAttribute("value"));

        if(actualLogInText.equals(expectedLogInText)){
            System.out.println("Text passed!");
        }else{
            System.out.println("Text failed!");
        }

        driver.close();
    }
}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In

PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */