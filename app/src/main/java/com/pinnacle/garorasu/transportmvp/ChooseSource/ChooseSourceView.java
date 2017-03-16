package com.pinnacle.garorasu.transportmvp.ChooseSource;

/**
 * Created by garorasu on 16/3/17.
 */

public interface ChooseSourceView {
    void requestOptions();
    void showProgress();
    void hideProgress();
    void showError();
}
