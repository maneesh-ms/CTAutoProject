package com.maven.cleartrip.framework.configuration;

/**
 * Created by manems on 3/23/2019.
 */
public class InfoServiceConfiguration implements Configuration {

    private String browser;

    public InfoServiceConfiguration(){
        //Collect info from service
        browser = "chrome";
    }

    @Override
    public String getBrowser() {
        return null;
    }

    @Override
    public String getChromDriverPath() {
        return null;
    }

    @Override
    public String getFirefoxDriverPath() {
        return null;
    }

}
