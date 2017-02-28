package com.khoantt91.trips.presenter.mvp.layerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

import com.khoantt91.trips.presenter.mvp.setup.SetupBaseActivity;
import com.khoantt91.trips.util.AppRepository;
import com.khoantt91.trips.util.PrefApplication;
import com.khoantt91.trips.util.UIApplication;
import com.khoantt91.trips.util.myerror.LogError;

import butterknife.ButterKnife;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public abstract class BaseActivity  extends AppCompatActivity implements SetupBaseActivity.View, View.OnClickListener {

    //region Variables
    private PrefApplication prefApplication;
    private SetupBaseActivity.Presenter presenter;
    private AppRepository appRepository;
    private final String TAG = BaseActivity.class.getSimpleName();
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appRepository = ((UIApplication) getApplication()).getAppRepository();
        //Should store Login Object in PrefApplication here to avoid null
        //appRepository.storeItem(AppRepository.PREFAPPLICATION_DATA_KEY, "object");
        this.presenter = setupMVP();
    }

    /***
     * Setup inital view
     */
    public void setupView(){
        ButterKnife.bind(this);
    }

    /***
     * Setup MVP Pattern, pass presenter interface
     * @return presenter
     */
    public abstract SetupBaseActivity.Presenter setupMVP();

    //region MVP Setup
    @Override
    public AppRepository getAppRepository() {
        if (appRepository != null) return appRepository;
        Log.e(TAG, LogError.NULL_OBJECT + ": AppRepository");
        return null;
    }
    //endregion

    //region Service Methods
    public void setStatusBarTranslucent(boolean makeTranslucent) {
        if (makeTranslucent) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        } else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }
    //endregion
}
