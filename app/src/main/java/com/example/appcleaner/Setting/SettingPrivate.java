package com.example.appcleaner.Setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.appcleaner.R;

public class SettingPrivate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_private);
        clickBackSetting();
    }
    public void clickBackSetting(){
        ImageView imageView = findViewById(R.id.imageView24);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingPrivate.this, SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}