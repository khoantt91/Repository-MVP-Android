package com.khoantt91.trips.data.model;

import android.util.Log;

import com.khoantt91.trips.util.myerror.LogError;

import java.util.ArrayList;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public class Pool {

    private ArrayList<Object> objects;
    private final String TAG = Pool.class.getSimpleName();

    public Pool() {
        objects = new ArrayList<>();
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public boolean addItem(Object object) {
        if (!objects.contains(object)) return objects.add(object);
        Log.e(TAG, LogError.DUPLICATE_OBJECT + " - addItem method");
        return false;
    }

    public Object getItem(int index) {
        if (objects != null) return objects.get(index);
        return null;
    }
}
