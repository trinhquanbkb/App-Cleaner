package com.example.appcleaner.Acitvity.SavePin;

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

import com.example.appcleaner.R;

public class SavePinRun extends AppCompatActivity {
    int isUserBack = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_pin_run);
        allAnim();
        transferRada();
    }

    public void anim1(View view) {
        ScaleAnimation scaleAnimation = (ScaleAnimation) AnimationUtils.loadAnimation(SavePinRun.this, R.anim.save_pin_scale_1);
        view.startAnimation(scaleAnimation);
    }

    public void anim2(View view) {
        ScaleAnimation scaleAnimation = (ScaleAnimation) AnimationUtils.loadAnimation(SavePinRun.this, R.anim.save_pin_scale_2);
        view.startAnimation(scaleAnimation);
    }

    public void anim3(View view) {
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.save_pin_rotate);
        view.startAnimation(rotateAnimation);
    }

    public void anim4(View view) {
        AlphaAnimation animation = (AlphaAnimation) AnimationUtils.loadAnimation(SavePinRun.this, R.anim.save_pin_alpha);
        view.startAnimation(animation);
    }

    public void anim5(View view) {
        AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(SavePinRun.this, R.anim.save_pin_set);
        view.startAnimation(animationSet);
    }

    @Override
    public void onBackPressed() {
        isUserBack = 1;
        super.onBackPressed();
    }

    public void transferRada() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(isUserBack == 0){
                            Intent intent = new Intent();
                            intent.setClass(SavePinRun.this, SavePinRada.class);
                            startActivity(intent);
                        }
                    }
                },1);
            }
        }, 4500);
    }

    public void allAnim() {
        anim1(findViewById(R.id.imageView73));
        anim2(findViewById(R.id.imageView75));
        anim3(findViewById(R.id.imageView72));
        anim4(findViewById(R.id.imageView76));
        anim4(findViewById(R.id.imageView77));
        anim4(findViewById(R.id.imageView78));
        anim5(findViewById(R.id.imageView71));
    }
}