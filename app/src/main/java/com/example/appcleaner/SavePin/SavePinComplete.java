package com.example.appcleaner.SavePin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.appcleaner.CoolerCPU.CoolerCPUComplete;
import com.example.appcleaner.CoolerCPU.CoolerCPUNotifice;
import com.example.appcleaner.R;

public class SavePinComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_pin_complete);
        transferNotifice();
    }

    public void transferNotifice(){
        try{
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent();
                    intent.setClass(SavePinComplete.this, SavePinNotifice.class);
                    startActivity(intent);
                }
            },2000);
        }catch (Exception e){
            new Exception("Error Thread in CPU complete: "+e);
        }
    }
}