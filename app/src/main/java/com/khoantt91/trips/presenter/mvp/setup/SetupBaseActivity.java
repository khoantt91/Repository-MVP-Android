package com.khoantt91.trips.presenter.mvp.setup;

import android.content.Context;

import com.khoantt91.trips.util.AppRepository;
import com.khoantt91.trips.util.PrefApplication;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public interface SetupBaseActivity {
    interface View {

        AppRepository getAppRepository();
    }

    interface Presenter {

    }

    interface Model {

    }
}
