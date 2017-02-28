package com.khoantt91.trips.presenter.mvp.setup;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public interface  SetupMainActivity extends SetupBaseActivity{

    interface View extends SetupBaseActivity.View {
        void showText(String text);
    }

    interface Presenter extends SetupBaseActivity.Presenter {
        void clickShowTextButton();
    }

    interface Model extends SetupBaseActivity.Model {
        String getIntentText();
    }
}
