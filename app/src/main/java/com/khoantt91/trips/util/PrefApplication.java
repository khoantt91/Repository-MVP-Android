package com.khoantt91.trips.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public class PrefApplication {

    //region Constructor
    private SharedPreferences mPrefs;
    private SharedPreferences.Editor mEdit;

    public PrefApplication(Context context) {
        mPrefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        mEdit = mPrefs.edit();
    }
    //endregion

    //region Key Constant
    private static final String PREFS_NAME = PrefApplication.class.getSimpleName();
    //endregion

    //region Service Methods

    //endregion
}
