package com.khoantt91.trips.presenter.mvp.setup;

import android.support.annotation.NonNull;

import com.khoantt91.trips.util.AppRepository;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public interface SetupBaseFragment {
    interface View {

        AppRepository getAppRepository();
    }

    interface Presenter {
    }

    interface Model {

    }
}
