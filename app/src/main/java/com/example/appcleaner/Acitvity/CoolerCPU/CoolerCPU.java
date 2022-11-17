package com.example.appcleaner.Acitvity.CoolerCPU;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;

import com.example.appcleaner.R;

public class CoolerCPU extends AppCompatActivity {
    int isUserBack = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooler_cpu);
        clickTwirl(findViewById(R.id.imageView26));
        clickTwirl(findViewById(R.id.imageView27));
        clickTwirl(findViewById(R.id.imageView28));
        clickCpuRada();
    }

    public void clickTwirl(View view) {
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.cooler_cpu_1);
        view.startAnimation(rotateAnimation);
    }

    @Override
    public void onBackPressed() {
        isUserBack = 1;
        super.onBackPressed();
    }

    public void clickCpuRada(){
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if(isUserBack == 0){
                                Intent intent = new Intent();
                                intent.setClass(CoolerCPU.this, CoolerCPURada.class);
                                startActivity(intent);
                            }
                        }
                    },1);
                }
            },3000);
        }catch (Exception e){
            new Exception("Error thread in CPU: "+e);
        }
    }
}