package com.learning.microservice.limitservice.models;

/**
 * @author Muhammad Danish Khan
 * @created 6/1/21 - 12:55 PM
 */
public class LimitConfiguration {
    private int minimum;

    private int maximum;

    public LimitConfiguration() {
    }

    public LimitConfiguration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}
