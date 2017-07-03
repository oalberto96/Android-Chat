package com.glassy.androidchat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by glassy on 6/25/17.
 */

public class AndroidChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
    }

    private void setupFirebase() {
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}
