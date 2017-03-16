package com.pinnacle.garorasu.transportmvp.Result;

import com.pinnacle.garorasu.transportmvp.Route;

import java.util.Date;

/**
 * Created by garorasu on 16/3/17.
 */

public interface ResultView {
    void fetchRoutes(String source,String destination,Date date);
    void showProgress();
    void hideProgress();
    void showError();
    void saveRoute(Route route);
    void viewRouteOnMap(Route route);
    void callOriginStation(Route route);
}
