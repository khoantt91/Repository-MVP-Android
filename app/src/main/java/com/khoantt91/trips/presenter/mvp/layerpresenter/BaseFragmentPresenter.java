package com.khoantt91.trips.presenter.mvp.layerpresenter;

import com.khoantt91.trips.presenter.mvp.setup.SetupBaseFragment;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public abstract class BaseFragmentPresenter implements SetupBaseFragment.Presenter {

    /**
     * Method require for extending BaseMerchantPresenter
     * Load data from server, intent, show list etc..
     */
    public abstract void setupInitialPresenterState();
}
