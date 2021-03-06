package com.cola.http.callback.impl;

import com.cola.http.callback.Callback;

/**
 * @ Author SpringWater
 * @ Date 15/12/7 下午11:08
 * @ Description // Please Add Annotation
 */
public abstract class DownloadResultCallback implements Callback {

    abstract void onStart();

    abstract void onProgress(float progress);

    @Override
    public void onSuccess(Object response) {

    }

    @Override
    public void onFailure(int statusCode, Throwable throwable) {

    }
}
