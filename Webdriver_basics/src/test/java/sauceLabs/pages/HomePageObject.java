package sauceLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
    private WebDriver driver;

    //Constructor
    public HomePageObject(WebDriver aDriver) {

        driver = aDriver;
    }

    //Elements Locators
    By headerLocator = By.id("headerMainNav");

    //Methods
    public WebElement getHeader()
    {
        WebElement header = driver.findElement(headerLocator);
        return  header;
    }
}
