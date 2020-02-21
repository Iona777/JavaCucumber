package sauceLabs.tests;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

import sauceLabs.pages.HomePageObject;
import sauceLabs.Utilities.*;


public class CheckSauceLabsHomePageTest {
    @Test
    public void site_header_is_on_home_page() {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
        //System.setProperty("webdriver.gecko.driver", "c:\\utils\\geckodriver.exe");
        browser = Driver.getDriver();

        HomePageObject theHomePage = new HomePageObject(browser);

        browser.get("http://saucelabs.com");
        WebElement header = theHomePage.getHeader();

        assertTrue((header.isDisplayed()));
        browser.close();
    }
}