package com.khoantt91.trips.presenter.mvp.setup;

/**
 * Created by ThienKhoa on 2/28/17.
 */

public interface OnModelResponseListener<SuccessfulObject, ErrorObject> {

    void onSucess(SuccessfulObject successfulObject);

    void onError(ErrorObject errorObject);
}
