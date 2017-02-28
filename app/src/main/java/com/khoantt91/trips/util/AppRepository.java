package com.khoantt91.trips.util;

import android.util.Log;

import com.khoantt91.trips.data.model.Pool;
import com.khoantt91.trips.util.myerror.LogError;

import java.util.HashMap;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public class AppRepository {

    //region Identity Key
    private final String TAG = AppRepository.class.getSimpleName();
    public static final String INTENT_DATA_KEY = "IntentData";
    public static final String PREFAPPLICATION_DATA_KEY = "PrefApplicationData";
    public static final String REQUESTQUEUE_KEY = "RequestQueue";
    //endregion

    private HashMap<String, Pool> storage;

    public AppRepository() {
        storage = new HashMap<>();
        storage.put(INTENT_DATA_KEY, new Pool());
        storage.put(PREFAPPLICATION_DATA_KEY, new Pool());
        storage.put(REQUESTQUEUE_KEY, new Pool());
    }

    public boolean storeItem(String identityKey, Object object) {
        Pool poolTemp = storage.get(identityKey);
        if (poolTemp != null) return poolTemp.addItem(object);
        Log.e(TAG, LogError.NULL_OBJECT + ": Store Pool");
        return false;
    }

    public Pool getPool(String identityKey) {
        Pool poolTemp = storage.get(identityKey);
        if (poolTemp != null) return poolTemp;
        Log.e(TAG, LogError.NULL_OBJECT + ": Get Pool");
        return null;
    }
}
