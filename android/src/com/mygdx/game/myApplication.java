package com.mygdx.game;

import android.app.Application;
import android.util.Log;

/**
 * Created by 3dium on 08.06.2017.
 */

public class myApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("myApplication", "onCreate");
    }

}
