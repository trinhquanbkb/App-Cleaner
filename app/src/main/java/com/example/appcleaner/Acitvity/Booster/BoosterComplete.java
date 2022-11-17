package com.example.appcleaner.Acitvity.Booster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.appcleaner.Acitvity.SavePin.SavePinComplete;
import com.example.appcleaner.Acitvity.SavePin.SavePinNotifice;
import com.example.appcleaner.R;

public class BoosterComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booster_complete);
        transferNotifice();
    }

    public void transferNotifice(){
        try{
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent();
                    intent.setClass(BoosterComplete.this, BoosterNotifice.class);
                    startActivity(intent);
                }
            },2000);
        }catch (Exception e){
            new Exception("Error Thread in CPU complete: "+e);
        }
    }
}