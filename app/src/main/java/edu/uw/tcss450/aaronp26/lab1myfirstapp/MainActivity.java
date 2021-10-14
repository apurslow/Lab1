package edu.uw.tcss450.aaronp26.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart(Bundle savedInstanceState) {
        super.onStart();
        Log.d("onstart debug", "on start debug message");

    }
    protected void onResume(Bundle savedInstanceState) {
        super.onResume();
        Log.i("onResume info","on resume info message");
    }
    protected void onPause(Bundle savedInstanceState) {
        super.onPause();
        Log.w("onPause warning","on pause warning message");
    }
    protected void onStop(Bundle savedInstanceState) {
        super.onStop();
        Log.e("onStop error","on stop error message");
    }
    protected void onDestroy(Bundle savedInstanceState) {
        super.onDestroy();
        Log.v("onDestroy verbose","on destroy verbose message");
    }

}
