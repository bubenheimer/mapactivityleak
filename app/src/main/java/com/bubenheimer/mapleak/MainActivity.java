package com.bubenheimer.mapleak;

import android.os.Bundle;
import android.util.Log;

import java.util.concurrent.atomic.AtomicInteger;

import androidx.appcompat.app.AppCompatActivity;

public final class MainActivity extends AppCompatActivity {
    private static final AtomicInteger INSTANCE_COUNTER = new AtomicInteger(0);

    private final int instanceNo = INSTANCE_COUNTER.incrementAndGet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().findFragmentById(R.id.fragment).setRetainInstance(true);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        Log.d("MainActivity", "Finalizing instance " + instanceNo);
        super.finalize();
    }
}
