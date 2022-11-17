package com.example.appcleaner.Acitvity.SavePin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.appcleaner.R;

public class SavePinRada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_pin_rada);
        transferCompleteCPU();
        rada(findViewById(R.id.imageView32));
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
                intent.setClass(SavePinRada.this, SavePinComplete.class);
                startActivity(intent);
            }
        }, 6000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ImageView imageView = findViewById(R.id.imageView33);
        imageView.setBackgroundResource(R.drawable.list_app_scan);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.run();
    }
}