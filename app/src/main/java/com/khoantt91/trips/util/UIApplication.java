package com.khoantt91.trips.util;

import android.app.Application;

import com.khoantt91.trips.domain.helper.NetworkHelper;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public class UIApplication extends Application {

    private AppRepository appRepository;
    private final String TAG = UIApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        appRepository = new AppRepository();
        appRepository.storeItem(AppRepository.REQUESTQUEUE_KEY,
                NetworkHelper.getInstance(getApplicationContext()).getRequestQueue());
    }

    public AppRepository getAppRepository() {
        return appRepository;
    }
}
