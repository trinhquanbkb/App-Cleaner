package com.example.appcleaner.Acitvity.WifiScan;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.example.appcleaner.R;

public class WifiScanComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_scan_complete);
        animator1();
        transferNotifice();
    }

    public void animator1() {
        ImageView imageView = findViewById(R.id.imageView60);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(WifiScanComplete.this, R.animator.quay_logo);
        animatorSet.setTarget(imageView);
        animatorSet.start();
    }

    public void transferNotifice() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(WifiScanComplete.this, WifiScanNotifce.class);
                startActivity(intent);
            }
        }, 3500);
    }
}