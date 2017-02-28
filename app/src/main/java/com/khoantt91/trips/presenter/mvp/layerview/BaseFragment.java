package com.khoantt91.trips.presenter.mvp.layerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.test.mock.MockApplication;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.khoantt91.trips.presenter.mvp.setup.SetupBaseActivity;
import com.khoantt91.trips.presenter.mvp.setup.SetupBaseFragment;
import com.khoantt91.trips.util.AppRepository;
import com.khoantt91.trips.util.PrefApplication;
import com.khoantt91.trips.util.UIApplication;
import com.khoantt91.trips.util.myerror.LogError;

import butterknife.ButterKnife;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public abstract class BaseFragment extends Fragment implements SetupBaseFragment.View, View.OnClickListener {

    //region Variables
    private PrefApplication prefApplication;
    private SetupBaseFragment.Presenter presenter;
    private AppRepository appRepository;
    private final String TAG = BaseFragment.class.getSimpleName();
    //endregion

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        appRepository = ((UIApplication) getActivity().getApplication()).getAppRepository();
        this.presenter = setupMVP();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /***
     * Setup inital view
     */
    public void setupView(View rootView){
        ButterKnife.bind(this, rootView);
    }

    /***
     * Setup MVP Pattern, pass presenter interface
     * @return presenter
     */
    public abstract SetupBaseFragment.Presenter setupMVP();

    //region MVP Setup
    @Override
    public AppRepository getAppRepository() {
        if (appRepository != null) return appRepository;
        Log.e(TAG, LogError.NULL_OBJECT + ": AppRepository");
        return null;
    }
    //endregion
}
