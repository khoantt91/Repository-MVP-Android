package com.khoantt91.trips.presenter.mvp.layermodel;

import android.util.Log;

import com.khoantt91.trips.presenter.mvp.setup.SetupMainActivity;
import com.khoantt91.trips.util.AppRepository;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public class MainActivityModel extends BaseActivityModel implements SetupMainActivity.Model {

    private final String TAG = MainActivityModel.class.getSimpleName();

    public MainActivityModel(AppRepository appRepository) {
        super(appRepository);
    }

    @Override
    public String getIntentText() {
        return (String) getAppRepository().getPool(AppRepository.INTENT_DATA_KEY).getItem(0);
    }
}
