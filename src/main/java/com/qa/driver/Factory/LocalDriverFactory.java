package com.qa.driver.Factory;

import com.qa.config.ConfigFactory;
import com.qa.driver.Manager.ChromeManager;
import com.qa.driver.Manager.FirefoxManager;
import com.qa.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return isBrowserChrome(browserType) ? ChromeManager.getDriver() : FirefoxManager.getDriver();
    }

    public static boolean isBrowserChrome(BrowserType browserType){
        return browserType == BrowserType.CHROME;
    }
}
