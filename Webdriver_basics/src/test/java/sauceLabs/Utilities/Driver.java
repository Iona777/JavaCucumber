package sauceLabs.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
    public static WebDriver myDriver = null;
    //public static WebDriverWait wait=null;

    public static WebDriver getDriver()
    {
        myDriver = new ChromeDriver();
        return myDriver;
    }

}
