package com.example.appcleaner.CoolerCPU;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.appcleaner.R;

public class CoolerCPUComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooler_cpucomplete);
        transferCPUNotifice();
    }

    public void transferCPUNotifice(){
        try{
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent();
                    intent.setClass(CoolerCPUComplete.this, CoolerCPUNotifice.class);
                    startActivity(intent);
                }
            },2000);
        }catch (Exception e){
            new Exception("Error Thread in CPU complete: "+e);
        }
    }
}