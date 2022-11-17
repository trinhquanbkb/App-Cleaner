package com.example.appcleaner.Acitvity.CleanRubbish;

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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.appcleaner.Adapter.RecycleViewAdapterItem;
import com.example.appcleaner.Model.Item;
import com.example.appcleaner.R;

import java.util.ArrayList;
import java.util.List;

public class CleanRubbishFile extends AppCompatActivity {
    int isUserBack = 0;
    private List<Item> items = new ArrayList<>();
    private RecyclerView recyclerView;
    int i;
    float n=5;
    RecycleViewAdapterItem recycleViewAdapterItem;
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_rubbish_file);
        setCheck();
        setListItem();
        setItemAdapterRecycle();
        deleteItem();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                handleText();
            }
        },7500);
        transferComplete();
    }

    public void check1() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageViewComplete1);
                    imageView.setBackgroundResource(R.drawable.check);
                    Button button = findViewById(R.id.buttonDelete);
                    button.setText("Đang quét Cache rác...");
                }
            },2500);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void check2() {
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ImageView imageView = findViewById(R.id.imageViewComplete2);
                    imageView.setBackgroundResource(R.drawable.check);
                    Button button = findViewById(R.id.buttonDelete);
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
                    ImageView imageView = findViewById(R.id.imageViewComplete3);
                    imageView.setBackgroundResource(R.drawable.check);
                    Button button = findViewById(R.id.buttonDelete);
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
                    ImageView imageView = findViewById(R.id.imageViewComplete4);
                    imageView.setBackgroundResource(R.drawable.check);
                }
            },6500);
        }catch (Exception e){
            new Exception(e);
        }
    }

    public void transferComplete(){
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if(isUserBack == 0){
                                Intent intent = new Intent();
                                intent.setClass(CleanRubbishFile.this, CleanRubbishComplete.class);
                                startActivity(intent);
                            }
                        }
                    },1);
                }
            },12000);
        }catch (Exception e){
            new Exception(e);
        }
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
        recyclerView = findViewById(R.id.recyclerViewItem1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                recycleViewAdapterItem = new RecycleViewAdapterItem(items, CleanRubbishFile.this);
                recyclerView.setAdapter(recycleViewAdapterItem);
            }
        },1500);
    }

    public void deleteItem() {
        LinearLayout view = findViewById(R.id.linearLayout5);
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view.getLayoutParams();
        View viewHide = findViewById(R.id.viewHide);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                params.weight=4.0f;
//                viewHide.setVisibility(View.INVISIBLE);
            }
        },6500);
        int t = 7000;
        for(int i=0;i<11;i++){
            t+=400;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    items.remove(0);
                    recycleViewAdapterItem = new RecycleViewAdapterItem(items, CleanRubbishFile.this);
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
                textView.setText("Đã phát hiện rác cần dọn dẹp ");
            }
        },7500);
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

    @Override
    public void onBackPressed() {
        isUserBack = 1;
        super.onBackPressed();
    }

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
                    //gán dữ liệu cho message msg
                    msg.obj = percent;
                    handler.sendMessage(msg);
                    //mỗi lần truyền dữ liệu sẽ nghỉ 100 ms rồi mới thực hiện tiếp
                    SystemClock.sleep(41);
                }
            }
        });
        //khởi tạo luồng con
        thread.start();
    }

    public void setCheck(){
        ImageView imageView1 = findViewById(R.id.imageViewComplete1);
        imageView1.setBackgroundResource(R.drawable.square);
        check1();
        ImageView imageView2 = findViewById(R.id.imageViewComplete2);
        imageView2.setBackgroundResource(R.drawable.square);
        check2();
        ImageView imageView3 = findViewById(R.id.imageViewComplete3);
        imageView3.setBackgroundResource(R.drawable.square);
        check3();
        ImageView imageView4 = findViewById(R.id.imageViewComplete4);
        imageView4.setBackgroundResource(R.drawable.square);
        check4();
    }
}