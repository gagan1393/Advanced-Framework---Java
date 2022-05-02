package com.qa.driver.Factory;

import com.qa.enums.BrowserRemoteModeType;
import com.qa.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){

        if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM){
            return SeleniumGridFactory.getDriver(browserType);
        }else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID){
            return SelenoidGridFactory.getDriver(browserType);
        } else if (browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK){

        }
        return null;
    }

}
