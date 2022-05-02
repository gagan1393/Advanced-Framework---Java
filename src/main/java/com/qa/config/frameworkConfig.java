package com.qa.config;

import com.qa.config.converters.StringToBrowserTypeConverter;
import com.qa.config.converters.StringToRemoteModeBrowserTypeConverter;
import com.qa.config.converters.StringToRunModeBrowserTypeConverter;
import com.qa.config.converters.StringToURLConverter;
import com.qa.enums.BrowserRemoteModeType;
import com.qa.enums.BrowserType;
import com.qa.enums.RunModeType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface frameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();
//
//    @Key("runModeMobile")
//    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
//    RunModeType mobileRunMode();
//
//    @Key("mobileRemoteMode")
//    @ConverterClass(StringToMobileRemoteModeTypeConverter.class)
//    MobileRemoteModeType mobileRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

    @Key("username")
    String userName();

    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();


//    @ConverterClass(StringToURLConverter.class)
//    @DefaultValue("http://127.0.0.1:4723/wd/hub")
//    URL localAppiumServerURL();
}
