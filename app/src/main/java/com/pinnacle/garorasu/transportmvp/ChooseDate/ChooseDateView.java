package com.pinnacle.garorasu.transportmvp.ChooseDate;

/**
 * Created by garorasu on 16/3/17.
 */

public interface ChooseDateView {
    void requestOptions();
    void showProgress();
    void hideProgress();
    void showError();
}
