package com.bubenheimer.mapleak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public final class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().findFragmentById(R.id.fragment).setRetainInstance(true);
        }
    }
}
