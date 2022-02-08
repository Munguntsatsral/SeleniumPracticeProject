package com.cydeo.tests.day2_locators_getText_getAttitude.task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement logInBox = driver.findElement(By.name("USER_LOGIN"));
        logInBox.sendKeys("incorrect username");

        WebElement resetPasswordButton = driver.findElement(By.className("login-btn"));
        resetPasswordButton.click();

        WebElement error = driver.findElement(By.className("errortext"));
        String actualErrorMessage = error.getText();
        String expectedErrorMessage = "Login or E-mail not found";

        if(expectedErrorMessage.equals(actualErrorMessage)){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test failed!");
        }

        driver.close();

    }
}
/*
TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found




PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */