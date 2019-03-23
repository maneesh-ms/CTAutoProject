package com.maven.cleartrip.framework.configuration;

/**
 * Created by manems on 3/23/2019.
 */
public class FileBasedConfiguration implements Configuration {

    private String browser;

    public FileBasedConfiguration(){
        //Collect info from file
        browser = "firefox";
    }

    @Override
    public String getBrowser() {
        return browser;
    }

    @Override
    public String getChromDriverPath() {
        return "//scratch//jenkins//workspace//drivers//chromedriver";
    }

    @Override
    public String getFirefoxDriverPath() {
        //return "//scratch//jenkins//workspace//drivers//firefoxdriver.exe";
        return "//scratch//jenkins//workspace//drivers//firefoxdriver";
    }
}
