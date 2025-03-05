package com.absatest.java.Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import com.absatest.java.Utilities.BrowserFactory;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setUp() {
        // Set up ChromeDriver using webdriver-manager
        // WebDriverManager.chromedriver().setup();

        // String browser = System.getProperty("browser", "chrome");   
        
        WebDriverManager.firefoxdriver().setup();

        String browser = System.getProperty("browser", "firefox");   


        driver = BrowserFactory.createDriver(browser);
    }

    @After
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}