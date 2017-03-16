package com.pinnacle.garorasu.transportmvp.Result;

import com.pinnacle.garorasu.transportmvp.Route;

import java.util.Date;

/**
 * Created by garorasu on 16/3/17.
 */

public interface ResultPresenter{
    void fetchRoutes(String source,String destination,Date date);
    void saveRoute(Route route);
    void onSuccess();
    void onError();
}