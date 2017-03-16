package com.pinnacle.garorasu.transportmvp.ChooseDestination;

/**
 * Created by garorasu on 16/3/17.
 */

public interface ChooseDestinationView {
    void requestOptions(String source);
    void showProgress();
    void hideProgress();
    void showError();
}
