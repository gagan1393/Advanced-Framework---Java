package com.qa.driver.Factory;

import com.qa.driver.Manager.SeleniumGridChromeManager;
import com.qa.driver.Manager.SeleniumGridFirefoxManager;
import com.qa.driver.Manager.SelenoiGridChromeManager;
import com.qa.driver.Manager.SelenoidGridFirefoxManager;
import com.qa.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidGridFactory {

    private SelenoidGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                        ? SelenoiGridChromeManager.getDriver()
                        : SelenoidGridFirefoxManager.getDriver();
    }
}
