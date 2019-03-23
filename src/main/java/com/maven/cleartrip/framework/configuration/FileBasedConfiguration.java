package com.maven.cleartrip.framework.configuration;

/**
 * Created by manems on 3/23/2019.
 */
public class FileBasedConfiguration implements Configuration {

    private String browser;

    public FileBasedConfiguration(){
        //Collect info from file
        browser = "chrome";
    }

    @Override
    public String getBrowser() {
        return browser;
    }

    @Override
    public String getChromDriverPath() {
        return "D://QA_Automation//chrome-driver//chromedriver.exe";
    }
}
