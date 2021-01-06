package com.learning.microservice.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Muhammad Danish Khan
 * @created 6/1/21 - 12:59 PM
 */

@Component
@ConfigurationProperties("limit-service")
public class Configuration {
    private int minimum;

    private int maximum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
