package com.khoantt91.trips.data.model;

import android.util.Log;

import com.khoantt91.trips.util.myerror.LogError;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ThienKhoa on 2/27/17.
 */

public class NoOpProxy implements InvocationHandler {

    private WeakReference<Object> view;
    private final String TAG = NoOpProxy.class.getSimpleName();

    public NoOpProxy(Object view) {
        this.view = new WeakReference<>(view);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        if (view == null || view.get() == null) {
            Log.e(TAG, LogError.NULL_OBJECT + ": View");
            return null;
        }

        return method.invoke(view.get(), args);
    }
}
