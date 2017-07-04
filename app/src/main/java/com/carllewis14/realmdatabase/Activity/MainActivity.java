package com.carllewis14.realmdatabase.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.carllewis14.realmdatabase.R;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
