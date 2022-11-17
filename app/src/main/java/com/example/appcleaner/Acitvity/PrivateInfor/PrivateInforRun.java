package com.example.appcleaner.Acitvity.PrivateInfor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.example.appcleaner.R;

public class PrivateInforRun extends AppCompatActivity {
    int isUserBack = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_infor_run);
        allClick();
        transferCompelete();
    }

    public void clickTwirl(View view) {
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.private_infor);
        view.startAnimation(rotateAnimation);
    }

    @Override
    public void onBackPressed() {
        isUserBack = 1;
        super.onBackPressed();
    }

    public void click1() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView66);
                    imageView.setBackgroundResource(R.drawable.privacy_clean_img_1);
                    TranslateAnimation rotateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(PrivateInforRun.this, R.anim.throw_private_info_1);
                    imageView.startAnimation(rotateAnimation);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ImageView imageView = findViewById(R.id.imageView66);
                            imageView.setBackgroundResource(0);
                        }
                    },1800);
                }
            },1000);
        }catch (Exception e){
            new Exception(e);
        }

    }

    public void click2() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView67);
                    imageView.setBackgroundResource(R.drawable.privacy_clean_img_2);
                    TranslateAnimation rotateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(PrivateInforRun.this, R.anim.throw_private_info_2);
                    imageView.startAnimation(rotateAnimation);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ImageView imageView = findViewById(R.id.imageView67);
                            imageView.setBackgroundResource(0);
                        }
                    },1800);
                }
            },1700);
        }catch (Exception e){
            new Exception(e);
        }

    }

    public void click3() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView68);
                    imageView.setBackgroundResource(R.drawable.privacy_clean_img_3);
                    TranslateAnimation rotateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(PrivateInforRun.this, R.anim.throw_private_info_3);
                    imageView.startAnimation(rotateAnimation);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ImageView imageView = findViewById(R.id.imageView68);
                            imageView.setBackgroundResource(0);
                        }
                    },1800);
                }
            },2400);
        }catch (Exception e){
            new Exception(e);
        }

    }

    public void click4() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView69);
                    imageView.setBackgroundResource(R.drawable.privacy_clean_img_4);
                    TranslateAnimation rotateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(PrivateInforRun.this, R.anim.throw_private_info_4);
                    imageView.startAnimation(rotateAnimation);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ImageView imageView = findViewById(R.id.imageView69);
                            imageView.setBackgroundResource(0);
                        }
                    },1800);
                }
            },3100);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void transferCompelete() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(isUserBack == 0){
                            Intent intent = new Intent();
                            intent.setClass(PrivateInforRun.this, PrivateInforComplete.class);
                            startActivity(intent);
                        }
                    }
                },1);
            }
        },6000);
    }

    public void allClick() {
        clickTwirl(findViewById(R.id.imageView65));
        clickTwirl(findViewById(R.id.imageView64));
        click1();
        click2();
        click3();
        click4();
    }
}