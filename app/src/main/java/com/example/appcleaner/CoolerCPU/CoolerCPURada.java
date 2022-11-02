package com.example.appcleaner.CoolerCPU;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.appcleaner.R;

public class CoolerCPURada extends AppCompatActivity {
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooler_cpurada);
        rada(findViewById(R.id.imageView32));
        transferCompleteCPU();
    }

    public void rada(View view) {
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.rada);
        view.startAnimation(rotateAnimation);
    }

    public void transferCompleteCPU(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(CoolerCPURada.this, CoolerCPUComplete.class);
                startActivity(intent);
            }
        }, 6000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        super.onStart();
        ImageView imageView = findViewById(R.id.imageView33);
        imageView.setBackgroundResource(R.drawable.list_app_scan);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.run();
    }
}