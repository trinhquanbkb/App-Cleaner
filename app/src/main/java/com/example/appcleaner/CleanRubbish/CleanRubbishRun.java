package com.example.appcleaner.CleanRubbish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.example.appcleaner.CoolerCPU.CoolerCPU;
import com.example.appcleaner.CoolerCPU.CoolerCPURada;
import com.example.appcleaner.R;

public class CleanRubbishRun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_rubbish_run);
        ImageView imageView = findViewById(R.id.imageView41);
        imageView.setBackgroundResource(R.drawable.quet_rac_img_1);
        runAnimation();
        transferCleanRubishFile();
    }

    public void eddy() {
        ImageView imageView = findViewById(R.id.imageView38);
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(CleanRubbishRun.this, R.anim.eddy);
        imageView.startAnimation(rotateAnimation);
    }

    public void click0() {
        ImageView imageView = findViewById(R.id.imageView37);
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(CleanRubbishRun.this, R.anim.eddy);
        imageView.startAnimation(rotateAnimation);
    }

    public void click1() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView42);
                    imageView.setBackgroundResource(R.drawable.quet_rac_img_4);
                    TranslateAnimation rotateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(CleanRubbishRun.this, R.anim.throw_garbage_1);
                    imageView.startAnimation(rotateAnimation);
                }
            },500);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void click2() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView43);
                    imageView.setBackgroundResource(R.drawable.quet_rac_img_3);
                    TranslateAnimation rotateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(CleanRubbishRun.this, R.anim.throw_garbage_2);
                    imageView.startAnimation(rotateAnimation);
                }
            },800);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void click3() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView44);
                    imageView.setBackgroundResource(R.drawable.quet_rac_img_2);
                    TranslateAnimation rotateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(CleanRubbishRun.this, R.anim.throw_garbage_3);
                    imageView.startAnimation(rotateAnimation);
                }
            },1000);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void click4(){
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView41);
                    imageView.setBackgroundResource(R.drawable.quet_rac_img_0);
                }
            },2200);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void transferCleanRubishFile(){
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent();
                    intent.setClass(CleanRubbishRun.this, CleanRubbishFile.class);
                    startActivity(intent);
                }
            },3000);
        }catch (Exception e){
            new Exception(e);
        }
    }
    public void runAnimation(){
        eddy();
        click0();
        click1();
        click2();
        click3();
        click4();
    }
}