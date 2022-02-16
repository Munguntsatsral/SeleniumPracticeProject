package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3_getAttribute_cssSelector {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

       // WebElement loginButtonText = driver.findElement(By.cssSelector("input[class='login-btn']"));
      //  WebElement loginButtonText = driver.findElement(By.cssSelector("input[type='submit']"));
        //WebElement loginButtonText = driver.findElement(By.cssSelector("input[onclick='BX.addClass(this, 'wait');"));
        WebElement loginButtonText = driver.findElement(By.cssSelector("input[value='Log In']"));
        String currentLoginButtonText = loginButtonText.getAttribute("value");

        String expectedLoginButtonText = "Log In";

        if(expectedLoginButtonText.equals(currentLoginButtonText)){
            System.out.println("Test passed, Log in button verification");
        } else{
            System.out.println("Test failed, Log in button verification");
        }


        System.out.println(currentLoginButtonText);

        driver.close();
    }
}
/*

TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
 */