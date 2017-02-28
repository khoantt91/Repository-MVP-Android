package com.khoantt91.trips.presenter.mvp.layerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.khoantt91.trips.R;
import com.khoantt91.trips.presenter.mvp.layerpresenter.MainActivityPresenter;
import com.khoantt91.trips.presenter.mvp.setup.SetupBaseActivity;
import com.khoantt91.trips.presenter.mvp.setup.SetupMainActivity;
import com.khoantt91.trips.util.AppRepository;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements SetupMainActivity.View {

    @BindView(R.id.tvText)
    TextView tvText;

    SetupMainActivity.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        getAppRepository().storeItem(AppRepository.INTENT_DATA_KEY, "Doi tuong Intent");
        getAppRepository().storeItem(AppRepository.INTENT_DATA_KEY, "Doi tuong Intent");
        getAppRepository().storeItem(AppRepository.INTENT_DATA_KEY, "Doi tuong Intent");
        getAppRepository().storeItem(AppRepository.INTENT_DATA_KEY, "Doi tuong Intent");
    }

    @Override
    public SetupBaseActivity.Presenter setupMVP() {
        this.presenter = new MainActivityPresenter(this);
        return presenter;
    }

    @OnClick(R.id.button)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                presenter.clickShowTextButton();
                break;
        }
    }

    @Override
    public void showText(String text) {
        tvText.setText(text);
    }
}
