package com.bubenheimer.mapleak;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import java.util.concurrent.TimeUnit;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.refWatcher(this)
                .watchDelay(5L, TimeUnit.SECONDS)
                .maxStoredHeapDumps(1)
                .buildAndInstall();
    }
}
