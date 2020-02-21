package sauceLabs.Steps;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.runtime.PendingException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sauceLabs.Utilities.Driver;
import sauceLabs.pages.HomePageObject;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStepdefs {

    @Given("^I have navigated to the Saucelabs page$")
    public void I_have_navigated_to_the_Saucelabs_page() {
        WebDriver browser;
        browser = Driver.getDriver();

        browser.get("http://saucelabs.com");
    }

    @Then("^the header should be displayed$")
    public void the_header_should_be_displayed() {
        WebDriver browser;
        browser = Driver.getDriver();

        HomePageObject theHomePage = new HomePageObject(browser);

        WebElement header = theHomePage.getHeader();
        assertTrue((header.isDisplayed()));
        browser.close();
    }

}
