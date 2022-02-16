package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class TC4_SimpleDropdowns {

        WebDriver driver;


      @BeforeMethod
        public void setupMethod(){
             driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("https://practice.cydeo.com/dropdown");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

      @Test
        public void simpleDropdownTest(){

          Select simpleDropdown  = new Select(driver.findElement(By.xpath("//select [@id='dropdown']")));
          WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

          String actualSimpleDropDownText = currentlySelectedOption.getText();
          String expectedSimpleDropDownText = "Please select an option";

          Assert.assertEquals(actualSimpleDropDownText, expectedSimpleDropDownText);

          Select stateDropdown = new Select(driver.findElement(By.xpath("//select [@id='state']")));

          String expectedStateDropdownText = "Select a State";
          String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

          Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);



          driver.close();
        }




    }

/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
 */