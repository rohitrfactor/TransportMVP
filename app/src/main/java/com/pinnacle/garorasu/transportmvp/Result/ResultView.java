package com.pinnacle.garorasu.transportmvp.Result;

import com.pinnacle.garorasu.transportmvp.Route;

import java.util.Date;

/**
 * Created by garorasu on 16/3/17.
 */

public interface ResultView {
    void showProgress();
    void hideProgress();
    void showError();
}
