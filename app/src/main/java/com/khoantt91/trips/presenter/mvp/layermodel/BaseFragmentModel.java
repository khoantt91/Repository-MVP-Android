package com.khoantt91.trips.presenter.mvp.layermodel;

import com.khoantt91.trips.presenter.mvp.setup.SetupBaseFragment;
import com.khoantt91.trips.util.AppRepository;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public class BaseFragmentModel implements SetupBaseFragment.Model {

    private AppRepository appRepository;

    public BaseFragmentModel(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    public AppRepository getAppRepository() {
        return appRepository;
    }

}
