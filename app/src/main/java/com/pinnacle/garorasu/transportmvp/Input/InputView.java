package com.pinnacle.garorasu.transportmvp.Input;

/**
 * Created by garorasu on 16/3/17.
 */

public interface InputView {
    void setSource();
    void setDestination();
    void setDate();
    void chooseSource();
    void chooseDestination(String source);
    void choooseDate();
    void getRoutes();
}
