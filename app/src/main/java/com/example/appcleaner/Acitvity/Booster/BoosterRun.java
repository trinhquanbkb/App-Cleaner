package com.example.appcleaner.Acitvity.Booster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;

import com.example.appcleaner.R;

public class BoosterRun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booster_run);
        allAnimator();
        transferClear();
    }

    public void animator1(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setBackgroundResource(R.drawable.boost_img_2);
                AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.booster_2);
                view.startAnimation(animationSet);
            }
        },200);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setBackgroundResource(0);
            }
        },5860);
    }

    public void animator2(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setBackgroundResource(R.drawable.boost_img_2);
                AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.booster_1);
                view.startAnimation(animationSet);
            }
        },1100);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setBackgroundResource(0);
            }
        }, 6760);
    }

    public void animator3(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setBackgroundResource(R.drawable.boost_img_2);
                AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.booster_1);
                view.startAnimation(animationSet);
            }
        },700);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setBackgroundResource(0);
            }
        }, 6360);
    }

    public void animator4(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setBackgroundResource(R.drawable.boost_img_2);
                AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.booster_2);
                view.startAnimation(animationSet);
            }
        },1400);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setBackgroundResource(0);
            }
        },6050);
    }

    public void animator5(View view) {
        AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.booster_3);
        view.startAnimation(animationSet);
    }

    public void animator6(View view) {
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.booster_4);
        view.startAnimation(rotateAnimation);
    }

    public void spaceShipTranslate(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TranslateAnimation translateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.space_ship_1);
                view.startAnimation(translateAnimation);
            }
        },100);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TranslateAnimation translateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.space_ship_2);
                view.startAnimation(translateAnimation);
            }
        },900);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TranslateAnimation translateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.space_ship_3);
                view.startAnimation(translateAnimation);
            }
        },1600);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TranslateAnimation translateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.space_ship_4);
                view.startAnimation(translateAnimation);
            }
        },2400);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TranslateAnimation translateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.space_ship_5);
                view.startAnimation(translateAnimation);
            }
        },3150);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TranslateAnimation translateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(BoosterRun.this, R.anim.space_ship6);
                view.startAnimation(translateAnimation);
            }
        },4150);
    }

    public void transferClear() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(BoosterRun.this, BoosterClear.class);
                startActivity(intent);
            }
        }, 4900);
    }
    public void allAnimator() {
        animator1(findViewById(R.id.imageView80));
        animator2(findViewById(R.id.imageView81));
        animator3(findViewById(R.id.imageView82));
        animator4(findViewById(R.id.imageView83));
        animator5(findViewById(R.id.imageView84));
        animator6(findViewById(R.id.imageView85));
        spaceShipTranslate(findViewById(R.id.imageView86));
    }
}