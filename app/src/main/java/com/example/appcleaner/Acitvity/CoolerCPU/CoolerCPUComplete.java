package com.example.appcleaner.Acitvity.CoolerCPU;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.appcleaner.R;

public class CoolerCPUComplete extends AppCompatActivity {
    int isUserBack = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooler_cpucomplete);
        transferCPUNotifice();
    }

    @Override
    public void onBackPressed() {
        isUserBack = 1;
        super.onBackPressed();
    }

    public void transferCPUNotifice(){
        try{
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if(isUserBack == 0){
                                Intent intent = new Intent();
                                intent.setClass(CoolerCPUComplete.this, CoolerCPUNotifice.class);
                                startActivity(intent);
                            }
                        }
                    },1);
                }
            },2000);
        }catch (Exception e){
            new Exception("Error Thread in CPU complete: "+e);
        }
    }
}