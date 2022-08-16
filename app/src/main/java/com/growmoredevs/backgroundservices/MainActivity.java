package com.growmoredevs.backgroundservices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);


        start.setOnClickListener(this);
        stop.setOnClickListener(this);

        // Runs in background without any user interaction

//        Start Service
//        stop service
//        Self Stop


        //bind service   allow components to interact with services E.g. send request, get result
        //unbind services  Interprocess Communication

    }

    @Override
    public void onClick(View view) {
        if (view == start) {
            startService(new Intent(this,MyService.class));

        } else if (view == stop) {
            stopService(new Intent(this, MyService.class));
        }
    }
}