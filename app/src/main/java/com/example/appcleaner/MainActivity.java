package com.example.appcleaner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.appcleaner.CleanRubbish.CleanRubbishRun;
import com.example.appcleaner.CoolerCPU.CoolerCPU;
import com.example.appcleaner.Setting.SettingActivity;
import com.example.appcleaner.WifiScan.WifiScanRun;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        homeHeaderImg0Twirl(findViewById(R.id.imageView2));
        broom(findViewById(R.id.imageView5));
        allClick();
    }

    public void homeHeaderImg0Twirl(View view) {
        ImageView imageView = findViewById(R.id.imageView2);
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.twirl);
        imageView.startAnimation(rotateAnimation);
    }

    public void broom(View view) {
        ImageView imageView = findViewById(R.id.imageView5);
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.broom_anim);
        imageView.startAnimation(rotateAnimation);
    }

    public void clickSetting(){
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });
    }
    public void clickCPU(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CoolerCPU.class);
                startActivity(intent);
            }
        });
    }
    public void clickBroom(){
        ImageView imageView = findViewById(R.id.imageView5);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CleanRubbishRun.class);
                startActivity(intent);
            }
        });
    }

    public void clickButtonClean(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CleanRubbishRun.class);
                startActivity(intent);
            }
        });
    }

    public void clickWifiScan(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, WifiScanRun.class);
                startActivity(intent);
            }
        });
    }

    public void allClick(){
        clickSetting();
        clickCPU(findViewById(R.id.linearLayout2));
        clickBroom();
        clickButtonClean(findViewById(R.id.button));
        clickButtonClean(findViewById(R.id.linearLayout1));
        clickWifiScan(findViewById(R.id.linearLayout3));
    }
}