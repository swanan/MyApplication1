package com.example.rtp_10305.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rtp_10305.myapplication1.fragment.Mainfragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            Mainfragment mainfragment = new Mainfragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.haha, mainfragment)
                    .commit();
        }
    }
}

