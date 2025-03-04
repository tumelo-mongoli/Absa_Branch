package com.absatest.java.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ch.qos.logback.core.util.Duration;

public class WebTablesPage {

    private WebDriver driver;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddUserButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
    }

    public void enterFirstName(String firstName) {
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lastName);
    }

    public void enterUserName(String UserName) {
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(UserName);
    }

    public void enterPassword(String Password) {
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password);
    }

    public void clickCompanyName() {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")).click();

    }


    public void SelectRole(String optionText) {

        WebElement dropdownToggle = driver.findElement(By.xpath("//*[@name='RoleId']"));
        dropdownToggle.click();
    
        // Locate and click the desired option
        String optionXpath = String.format("//*[@name='RoleId']/option[text()='Customer']", optionText);
        WebElement option = driver.findElement(By.xpath(optionXpath));
        option.click();
    }

    public void enterEmailAddress(String EmailAddress) {
        driver.findElement(By.xpath("//*[@name='Email']")).sendKeys(EmailAddress);
    }


    public void enterCellPhoneNUmber(String Mobilephone) {
        driver.findElement(By.xpath("//*[@name='Mobilephone']")).sendKeys(Mobilephone);
    }



    public void clickSaveButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
    }

    // public boolean isUserAdded(String firstName) {
    //     return driver.findElement(By.xpath("//td[contains(text(),'" + firstName + "')]")).isDisplayed();
    // }

    
}