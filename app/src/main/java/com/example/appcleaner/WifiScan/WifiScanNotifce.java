package com.example.appcleaner.WifiScan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.appcleaner.CoolerCPU.CoolerCPUNotifice;
import com.example.appcleaner.MainActivity;
import com.example.appcleaner.R;

public class WifiScanNotifce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_scan_notifce);
        clickBackHome();
    }

    private void clickBackHome() {
        ImageView imageView = findViewById(R.id.imageView35);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(WifiScanNotifce.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}