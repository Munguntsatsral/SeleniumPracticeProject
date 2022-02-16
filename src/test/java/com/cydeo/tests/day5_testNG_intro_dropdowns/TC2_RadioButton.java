package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC2_RadioButton {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/radio_buttons");
      /*  WebElement hockeyBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyBtn.click();

        System.out.println("hockeyBtn.isSelected() = "
                + hockeyBtn.isSelected());
                
       */
        List<WebElement> sportRadioButton = driver.findElements(By.name("sport"));
        for (WebElement each:sportRadioButton) {
            String eachID = each.getAttribute("id");
            System.out.println("eachID = " + eachID);

            if(eachID.equals("hockey")){
                each.click();
                System.out.println("Hockey is selected: " + each.isSelected());
                break;
            }
        }
        driver.close();
    }

//minimize below window



}
/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */