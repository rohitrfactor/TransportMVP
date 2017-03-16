package com.pinnacle.garorasu.transportmvp.ChooseDestination;

/**
 * Created by garorasu on 16/3/17.
 */

public interface ChooseDestinationPresenter {
    void requestOptions(String source);
    void onSuccess();
    void onError();
}
