package com.qa.driver.Factory;

import com.qa.driver.Manager.SeleniumGridChromeManager;
import com.qa.driver.Manager.SeleniumGridFirefoxManager;
import com.qa.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                        ? SeleniumGridChromeManager.getDriver()
                        : SeleniumGridFirefoxManager.getDriver();
    }
}
