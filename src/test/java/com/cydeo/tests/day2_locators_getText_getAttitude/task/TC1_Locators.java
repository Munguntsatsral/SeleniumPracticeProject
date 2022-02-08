package com.cydeo.tests.day2_locators_getText_getAttitude.task;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Locators {
    public static void main(String[] args) throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().fullscreen();

    driver.get("https://login1.nextbasecrm.com/");

        WebElement usernameInput = driver.findElement(By.className("login-inp"));
        usernameInput.sendKeys("incorrect");
        usernameInput.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrect");
        passwordInput.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

      String message = driver.findElement(By.className("errortext")).getText();

      String expectedMessage = "Incorrect login or password";
      if(message.equals(expectedMessage)){
          System.out.println("Test passed!");
      }else{
          System.out.println("Test Failed");
      }

        Thread.sleep(2000);

      driver.quit();


    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password

PS: Inspect and decide which locator you should be using to locate web
elements.
 */