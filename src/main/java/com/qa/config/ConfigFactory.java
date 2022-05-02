package com.qa.config;

import org.aeonbits.owner.ConfigCache;

public class ConfigFactory {
    private ConfigFactory(){}

    public static frameworkConfig getConfig(){
        return ConfigCache.getOrCreate(frameworkConfig.class);
    }
}
