package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_cssSelector_getText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();



        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

       // WebElement verifyResetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));
        WebElement verifyResetPassword = driver.findElement(By.cssSelector("button[class='login-btn']"));
        String actualResetPassword = verifyResetPassword.getText();

       // System.out.println(actualResetPassword);

        String expectedResetPassword = "Reset password";


        if(expectedResetPassword.equals(actualResetPassword)){
            System.out.println("Test passed - to verified reset password button");
        }else{
            System.out.println("Test failed - to verified reset password button");
        }

        //*[@id="context_module_item_49127"]

        driver.close();
    }

}
/*
TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password

PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */