package com.example.appcleaner.Acitvity.Setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appcleaner.R;

public class SettingIntroduce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_introduce);
        clickBackSetting();
        clickOnSettingPrivate();
        clickOnSettingRules();
    }
    public void clickBackSetting(){
        ImageView imageView = findViewById(R.id.imageView22);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingIntroduce.this, SettingActivity.class);
                startActivity(intent);
            }
        });
    }
    public void clickOnSettingPrivate(){
        TextView textView = findViewById(R.id.textView14);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingIntroduce.this, SettingRules.class);
                startActivity(intent);
            }
        });
    }
    public void clickOnSettingRules(){
        TextView textView = findViewById(R.id.textView15);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingIntroduce.this, SettingPrivate.class);
                startActivity(intent);
            }
        });
    }
}