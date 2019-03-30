package com.demo.fastsharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.library.MySharedPreferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MySharedPreferences sharedPreferences = new MySharedPreferences(this, "appdb");

    }
}
