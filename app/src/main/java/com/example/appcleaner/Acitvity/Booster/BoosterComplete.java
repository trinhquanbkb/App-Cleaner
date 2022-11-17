package com.example.appcleaner.Acitvity.Booster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.appcleaner.Acitvity.SavePin.SavePinComplete;
import com.example.appcleaner.Acitvity.SavePin.SavePinNotifice;
import com.example.appcleaner.R;

public class BoosterComplete extends AppCompatActivity {
    int isUserBack = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booster_complete);
        transferNotifice();
    }

    @Override
    public void onBackPressed() {
        isUserBack = 1;
        super.onBackPressed();
    }

    public void transferNotifice(){
        try{
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if(isUserBack == 0){
                                Intent intent = new Intent();
                                intent.setClass(BoosterComplete.this, BoosterNotifice.class);
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