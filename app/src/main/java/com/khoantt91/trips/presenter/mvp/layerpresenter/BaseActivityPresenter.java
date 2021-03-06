package com.khoantt91.trips.presenter.mvp.layerpresenter;

import com.khoantt91.trips.data.model.NoOpProxy;
import com.khoantt91.trips.presenter.mvp.layermodel.BaseActivityModel;
import com.khoantt91.trips.presenter.mvp.setup.SetupBaseActivity;

import java.lang.reflect.Proxy;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public abstract class BaseActivityPresenter implements SetupBaseActivity.Presenter {

    /**
     * Method require for extending BaseMerchantPresenter
     * Load data from server, intent, show list etc..
     */
    public abstract void setupInitialPresenterState();
}
