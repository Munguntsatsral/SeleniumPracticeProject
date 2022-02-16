package com.cydeo.tests.day2_locators_getText_getAttitude;
import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task2_ToolVerification { public static void main(String[] args) throws InterruptedException{


   // WebDriverManager.chromedriver().setup();
 //  WebDriver driver = new ChromeDriver();

    WebDriver driver = WebDriverFactory.getDriver("chrome");

    driver.manage().window().fullscreen();

    driver.navigate().to("https://practice.cydeo.com");

    String currentURL = driver.getCurrentUrl();
    if(currentURL.contains("cydeo")){
        System.out.println("URL is expected, verification passed!");
    } else{
        System.out.println("URL is not as expected, Verification failed!");
    }

    String expectedTitle = "Practice";

    String actualTitle = driver.getTitle();
    if(actualTitle.equals(expectedTitle)){
        System.out.println("Title is expected, Verification passed!");
    } else{
        System.out.println("Title is not as expected, Verification failed!");
    }

    Thread.sleep(3000);
    driver.close();

}
}
//        TC #1: Cydeo practice tool verifications
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com
//        3. Verify URL contains
//        Expected: cydeo
//        4. Verify title:
//        Expected: Practice