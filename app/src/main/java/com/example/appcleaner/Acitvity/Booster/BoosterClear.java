package com.example.appcleaner.Acitvity.Booster;

import static androidx.core.content.ContentProviderCompat.requireContext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.appcleaner.Adapter.RecycleViewAdapterItem;
import com.example.appcleaner.Model.Item;
import com.example.appcleaner.R;

import java.util.ArrayList;
import java.util.List;

public class BoosterClear extends AppCompatActivity {
    private List<Item> items = new ArrayList<>();
    private RecyclerView recyclerView;
    int i;
    float n=5;
    RecycleViewAdapterItem recycleViewAdapterItem;
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booster_clear);
        setListItem();
        setItemAdapterRecycle();
        deleteItem();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                handleText();
            }
        },1500);
    }

    public void setListItem(){
        items.add(new Item("Google Chrome", "Mục rác",R.drawable.draw_anim_1));
        items.add(new Item("FaceBook", "Mục rác", R.drawable.draw_anim_2));
        items.add(new Item("Gmail", "Mục rác", R.drawable.draw_anim_3));
        items.add(new Item("Google Map", "Mục rác", R.drawable.draw_anim_4));
        items.add(new Item("Office", "Mục rác", R.drawable.draw_anim_5));
        items.add(new Item("Youtube", "Mục rác", R.drawable.draw_anim_6));
        items.add(new Item("Zine", "Mục rác", R.drawable.draw_anim_7));
        items.add(new Item("Zoom", "Mục rác", R.drawable.draw_anim_8));
        items.add(new Item("Facebook Lite", "Mục rác", R.drawable.draw_anim_9));
        items.add(new Item("Messenger", "Mục rác", R.drawable.draw_anim_10));
        items.add(new Item("CH Play", "Mục rác", R.drawable.draw_anim_11));
    }

    public void setItemAdapterRecycle(){
        recyclerView = findViewById(R.id.recyclerViewItem);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                recycleViewAdapterItem = new RecycleViewAdapterItem(items, BoosterClear.this);
                recyclerView.setAdapter(recycleViewAdapterItem);
            }
        },1500);
    }

    public void deleteItem() {
        int t = 1500;
        for(int i=0;i<11;i++){
            t+=400;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    items.remove(0);
                    recycleViewAdapterItem = new RecycleViewAdapterItem(items, BoosterClear.this);
                    recyclerView.setAdapter(recycleViewAdapterItem);
                }
            }, t);
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TextView textView = findViewById(R.id.textViewchange1);
                TextView textView1 = findViewById(R.id.textViewRun);
                textView1.setText(null);
                textView.setText("Đã phát hiện ứng dụng cần tăng tốc ");
            }
        },1500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(BoosterClear.this, BoosterComplete.class);
                startActivity(intent);
            }
        },6500);
    }

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            //khi luồng con sendMessage() thì ngay lập tức phương thức này sẽ nhận được msg.
            super.handleMessage(msg);
            EditText editText = findViewById(R.id.editTextGB);
            String t = msg.obj.toString();
            editText.setText(t+" GB");
        }
    };

    private void handleText() {
        EditText editText = findViewById(R.id.editTextGB);
        //thread là một background thread và không thể thao tác trực tiếp được với view, dữ liệu xử lý ở đây sẽ được đẩy lên UI thread thông qua message
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=100; i>=0; i--){
                    //lấy message từ UI Thread
                    Message msg = handler.obtainMessage();
                    double g = i/25.2;
                    double percent = Math.round(g*100.00)/100.00;
                    System.out.println("hello: "+ percent);
                    //gán dữ liệu cho message msg
                    msg.obj = percent;
                    handler.sendMessage(msg);
                    //mỗi lần truyền dữ liệu sẽ nghỉ 100 ms rồi mới thực hiện tiếp
                    SystemClock.sleep(42);
                }
            }
        });
        //khởi tạo luồng con
        thread.start();
    }
}