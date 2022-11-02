package com.example.appcleaner.Setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.appcleaner.MainActivity;
import com.example.appcleaner.R;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        clickBackHome();
        clickIntroduce(findViewById(R.id.imageView20));
        clickIntroduce(findViewById(R.id.textView11));
        clickIntroduce(findViewById(R.id.imageView21));
        clickRules(findViewById(R.id.imageView16));
        clickRules(findViewById(R.id.imageView17));
        clickRules(findViewById(R.id.textView9));
        clickPrivate(findViewById(R.id.imageView18));
        clickPrivate(findViewById(R.id.imageView19));
        clickRules(findViewById(R.id.textView10));
    }

    public void clickBackHome(){
        ImageView imageView = findViewById(R.id.imageView15);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void clickIntroduce(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, SettingIntroduce.class);
                startActivity(intent);
            }
        });
    }
    public void clickRules(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, SettingRules.class);
                startActivity(intent);
            }
        });
    }
    public void clickPrivate(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, SettingPrivate.class);
                startActivity(intent);
            }
        });
    }
}