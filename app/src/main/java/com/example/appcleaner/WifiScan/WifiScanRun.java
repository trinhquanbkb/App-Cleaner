package com.example.appcleaner.WifiScan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appcleaner.R;

public class WifiScanRun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_scan_run);
        allAnimation();
        transferComplete();
    }

    public void animation1(View view) {
        AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(WifiScanRun.this, R.anim.wifi_scan_1);
        view.startAnimation(animationSet);
    }

    public void animation2(View view) {
        ScaleAnimation scaleAnimation= (ScaleAnimation) AnimationUtils.loadAnimation(WifiScanRun.this, R.anim.wifi_scan_2);
        view.setAnimation(scaleAnimation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        TextView textView = findViewById(R.id.textView18);
                        textView.setText("Đang quét DNS Spoofing ...");
                    }
                }, 1000);
                ScaleAnimation scaleAnimation= (ScaleAnimation) AnimationUtils.loadAnimation(WifiScanRun.this, R.anim.wifi_scan_3);
                view.setAnimation(scaleAnimation);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        TextView textView = findViewById(R.id.textView18);
                        textView.setText("Đang quét SSL Striping ...");
                        ScaleAnimation scaleAnimation= (ScaleAnimation) AnimationUtils.loadAnimation(WifiScanRun.this, R.anim.wifi_scan_4);
                        view.setAnimation(scaleAnimation);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                TextView textView = findViewById(R.id.textView18);
                                textView.setText("Đang quét SSL Splitting ...");
                                ScaleAnimation scaleAnimation= (ScaleAnimation) AnimationUtils.loadAnimation(WifiScanRun.this, R.anim.wifi_scan_5);
                                view.setAnimation(scaleAnimation);
                            }
                        },5000);
                    }
                },2000);
            }
        },5000);
    }

    public void animation3() {
        ImageView imageView = findViewById(R.id.imageView52);
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.wifi_scan_6);
        imageView.startAnimation(rotateAnimation);
    }

    public void transferComplete(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(WifiScanRun.this, WifiScanComplete.class);
                startActivity(intent);
            }
        },15000);
    }
    public void allAnimation(){
        animation1(findViewById(R.id.imageView53));
        animation2(findViewById(R.id.imageView59));
        animation3();
    }
}