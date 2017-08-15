package com.evil.mathjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.evil.mathlib.MathUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double a = 120.23;
        double b = 1000.000121;
        Log.e("noah","a+b="+MathUtils.add(a,b));
    }
}
