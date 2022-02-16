package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration_Form {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement firstNasme = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNasme.sendKeys("Munguntsatsral");

        WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='last name']"));
        lastName.sendKeys("Nyamtogtokh");

        WebElement userName = driver.findElement(By.cssSelector("input[placeholder='username']"));
        userName.sendKeys("Munguntsatsral");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("munguntsatsral@yahoo.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Munguntsatsral");

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='571-000-0000']"));
        phoneNumber.sendKeys("773-773-7373");

        WebElement genderRadioBtn = driver.findElement(By.xpath("//input[@type='radio'][@value='female']"));
        genderRadioBtn.click();

        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@type='text'][@name='birthday']"));
        dateOfBirth.sendKeys("03/06/1984");

        WebElement departmentOffice = driver.findElement(By.cssSelector("select[class ='form-control selectpicker'][name='department']"));
        Select deptSelectObj = new Select(departmentOffice);
        deptSelectObj.selectByIndex(1);

        WebElement jobTitle = driver.findElement(By.cssSelector("select[class ='form-control selectpicker'][name='job_title']"));
        Select jobTitleObj = new Select(jobTitle);
        jobTitleObj.selectByIndex(4);

        WebElement progLanguageCheckbox = driver.findElement(By.cssSelector("input[value='java']"));
        progLanguageCheckbox.click();

        WebElement signupButton = driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        signupButton.click();


        Thread.sleep(5000);

        driver.close();


    }
}
