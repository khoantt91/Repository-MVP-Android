package com.khoantt91.trips.presenter.mvp.layermodel;

import com.khoantt91.trips.presenter.mvp.setup.SetupBaseActivity;
import com.khoantt91.trips.util.AppRepository;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public class BaseActivityModel implements SetupBaseActivity.Model {

    private AppRepository appRepository;

    public BaseActivityModel(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    public AppRepository getAppRepository() {
        return appRepository;
    }
}
