package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;

import com.example.mylibrary.TestLibrary;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable @android.support.annotation.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestLibrary.test();
    }
}
