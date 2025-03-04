package com.absatest.java.StepDefinition;
import com.absatest.java.PageObjects.*;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;
import java.util.Random;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProfileSteps {

    private WebDriver driver;
    private WebTablesPage webTablesPage;
    private String uniqueUsername;
    

    @Given("User Launch Chrome Browser")
    public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        webTablesPage = new WebTablesPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("Landing Page", new ByteArrayInputStream(screenshot));
    }

    @And("The page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    @Then("User clicks on the Add user button")
    public void user_clicks_on_the_add_user_button() {
        webTablesPage.clickAddUserButton();
    }


    @Then("User enters a First Name")
public void user_enters_a_first_name() {
    webTablesPage.enterFirstName("John");

}

    @Then("User enters a Last Name")
        public void user_enters_a_last_name() {
               // Enter Last Name
               webTablesPage.enterLastName("Testers");

    }

    @Then("User enters a Password")
    public void user_enters_a_password() {

    webTablesPage.enterPassword("Password123");

    }


    @Then("User enters a User Name")
    public void user_enters_a_user_name() {

    Random random = new Random();
    int randomNumber = random.nextInt(9000) + 1000; 
    uniqueUsername = "John" + randomNumber;
    webTablesPage.enterUserName(uniqueUsername);
}

    @Then("Click the Company type")
    public void click_the_company_type() throws InterruptedException {

        webTablesPage.clickCompanyName();
        Thread.sleep(3000);

    }


    @Then("Selects a Role")
    public void selects_a_role() {

        webTablesPage.SelectRole("Admin");
}


@Then("User enters an Email Address")
public void user_enters_an_email_address() {

    webTablesPage.enterEmailAddress("JohnTest@gmal.com");

}


@Then("User enters a Cell Phone Number")
public void user_enters_a_cell_phone_number() {

    webTablesPage.enterCellPhoneNUmber("0721548562");

}

    @Then("Click the save button")
    public void click_the_save_button() {
        webTablesPage.clickSaveButton();

    }
    @Then("Close Browser")
    public void close_browser() {
        driver.quit();
    }


}