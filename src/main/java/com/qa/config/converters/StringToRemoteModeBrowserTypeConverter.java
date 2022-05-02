package com.qa.config.converters;

import com.qa.enums.BrowserRemoteModeType;
import com.qa.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType> {
    @Override
    public BrowserRemoteModeType convert(Method method, String remoteMode) {

        return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}
