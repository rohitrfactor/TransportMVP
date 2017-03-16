package com.pinnacle.garorasu.transportmvp.ChooseSource;

/**
 * Created by garorasu on 16/3/17.
 */

public interface ChooseSourcePresenter {
    void requestOptions();
    void onSuccess();
    void onError();
}
