package com.example.appcleaner.Adapter;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appcleaner.Model.Item;
import com.example.appcleaner.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class RecycleViewAdapterItem extends RecyclerView.Adapter<RecycleViewAdapterItem.HolderItem> {
    List<Item> items = new ArrayList<>();
    private Context context;

    public RecycleViewAdapterItem(List<Item> item, Context context) {
        this.items = item;
        this.context = context;
    }

    @NonNull
    @Override
    public RecycleViewAdapterItem.HolderItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_delete, parent, false);
        //khi có linkAdapter thì items trong recycleViewAdapterItem sẽ được đọc mới
        return new HolderItem(view).linkAdapter(this);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderItem holder, int position) {
        int image = items.get(position).getImage();
        String textView1 = items.get(position).getName();
        String textView2 = items.get(position).getTitle();
        holder.imageView.setBackgroundResource(image);
        holder.textView1.setText(textView1);
        holder.textView2.setText(textView2);
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    public static class HolderItem extends RecyclerView.ViewHolder{
        int t=0;
        int i;
        private List<Item> itemList;
        ImageView imageView;
        TextView textView1;
        TextView textView2;
        RecycleViewAdapterItem adapter;
        public HolderItem(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewItem);
            textView1 = itemView.findViewById(R.id.textViewItem1);
            textView2 = itemView.findViewById(R.id.textViewItem2);
        }

        //phương thức này trả ra holderItem của hiện tại sau khi delete item, nếu không có phương thức này thì recycViewAdapteritem
        // sẽ vẫn chỉ show ra listItem khi chưa xóa
        public HolderItem linkAdapter(RecycleViewAdapterItem adapter){
            this.adapter = adapter;
            return this;
        }
    }
}
