package com.example.appcleaner.Acitvity.CleanRubbish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.appcleaner.Acitvity.Booster.BoosterNotifice;
import com.example.appcleaner.MainActivity;
import com.example.appcleaner.R;

public class CleanRubbishNotifice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_rubbish_notifice);
        clickBackHome();
    }

    private void clickBackHome() {
        ImageView imageView = findViewById(R.id.imageView35);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(CleanRubbishNotifice.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}