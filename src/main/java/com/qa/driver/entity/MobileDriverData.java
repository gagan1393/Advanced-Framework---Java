package com.qa.driver.entity;

import com.qa.enums.MobilePlatformType;
import com.qa.enums.MobileRemoteModeType;
import lombok.Getter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter
public class MobileDriverData {

    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
}
