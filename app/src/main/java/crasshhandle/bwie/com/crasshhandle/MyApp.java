package crasshhandle.bwie.com.crasshhandle;

import android.app.Application;

/**
 * Created by dell on 2017/12/5.
 */

public class MyApp extends Application {
    private static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        //注册代码
       CrashHandle crashHandler = new CrashHandle();
        crashHandler.init(getApplicationContext());
    }
}
