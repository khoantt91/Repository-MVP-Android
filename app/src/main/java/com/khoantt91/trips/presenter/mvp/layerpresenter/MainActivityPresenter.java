package com.khoantt91.trips.presenter.mvp.layerpresenter;

import com.khoantt91.trips.data.model.NoOpProxy;
import com.khoantt91.trips.presenter.mvp.layermodel.MainActivityModel;
import com.khoantt91.trips.presenter.mvp.setup.SetupBaseActivity;
import com.khoantt91.trips.presenter.mvp.setup.SetupMainActivity;

import java.lang.reflect.Proxy;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public class MainActivityPresenter extends BaseActivityPresenter implements SetupMainActivity.Presenter {

    private SetupMainActivity.View view;
    private SetupMainActivity.Model model;

    public MainActivityPresenter(SetupBaseActivity.View view) {
        this.view = (SetupMainActivity.View) Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class[]{SetupMainActivity.View.class}, new NoOpProxy(view));
        this.model = new MainActivityModel(view.getAppRepository());
    }

    @Override
    public void setupInitialPresenterState() {

    }

    @Override
    public void clickShowTextButton() {
        view.showText(model.getIntentText());
    }
}
