package com.maven.cleartrip.framework.configuration;

/**
 * Created by manems on 3/23/2019.
 */
public class ConfigurationFactory {

    boolean instanceInfoUp = false;

    public Configuration getConfiguration() {
        if(instanceInfoUp) {
            return new InfoServiceConfiguration();
        }
        else{
            return new FileBasedConfiguration();
        }

    }

}
