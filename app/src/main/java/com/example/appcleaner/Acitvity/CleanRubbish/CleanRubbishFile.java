package com.example.appcleaner.Acitvity.CleanRubbish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ImageView;

import com.example.appcleaner.R;

public class CleanRubbishFile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_rubbish_file);
        setCheck();
        transferDeleteFile();
    }

    public void check1() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView47);
                    imageView.setBackgroundResource(R.drawable.check);
                    Button button = findViewById(R.id.button1);
                    button.setText("Đang quét Cache rác...");
                }
            },3500);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void check2() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView48);
                    imageView.setBackgroundResource(R.drawable.check);
                    Button button = findViewById(R.id.button1);
                    button.setText("Đang quét Tệp tin tạm thời...");
                }
            },4500);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void check3() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView49);
                    imageView.setBackgroundResource(R.drawable.check);
                    Button button = findViewById(R.id.button1);
                    button.setText("Đang quét Quảng cáo rác...");
                }
            },5000);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void check4() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageView50);
                    imageView.setBackgroundResource(R.drawable.check);
                }
            },6500);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void transferDeleteFile(){
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent();
                    intent.setClass(CleanRubbishFile.this, CleanRubbishDeleteFile.class);
                    startActivity(intent);
                }
            },7500);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void setCheck(){
        ImageView imageView1 = findViewById(R.id.imageView47);
        imageView1.setBackgroundResource(R.drawable.square);
        check1();
        ImageView imageView2 = findViewById(R.id.imageView48);
        imageView2.setBackgroundResource(R.drawable.square);
        check2();
        ImageView imageView3 = findViewById(R.id.imageView49);
        imageView3.setBackgroundResource(R.drawable.square);
        check3();
        ImageView imageView4 = findViewById(R.id.imageView50);
        imageView4.setBackgroundResource(R.drawable.square);
        check4();
    }
}