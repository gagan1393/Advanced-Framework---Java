package com.qa.driver.Factory;

import com.qa.driver.Manager.BrowserStackChromeManager;
import com.qa.driver.Manager.BrowserStackFirefoxManager;
import com.qa.driver.Manager.SelenoiGridChromeManager;
import com.qa.driver.Manager.SelenoidGridFirefoxManager;
import com.qa.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {

    private BrowserStackFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                        ? BrowserStackChromeManager.getDriver()
                        : BrowserStackFirefoxManager.getDriver();
    }
}
