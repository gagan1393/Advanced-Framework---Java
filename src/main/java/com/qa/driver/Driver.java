package com.qa.driver;

import com.qa.config.ConfigFactory;
import com.qa.driver.Factory.LocalDriverFactory;

public class Driver {

    public void initDriver(){

       LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
    }

    public void quitDriver(){

    }
}
