package com.example.maeily_mobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class MainViewAdapter extends RecyclerView.Adapter<MainViewAdapter.Holder> {

    private Context context;
    private List<MainViewAdapter> list = new ArrayList<>();
    private char title;
    private char content;

    public MainViewAdapter(Context context, List<MainViewAdapter> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MainViewAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewitem, parent, false);
        Holder holder = new Holder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MainViewAdapter.Holder holder, int position) {
        int itemposition = position;
        holder.titleText.setText(list.get(itemposition).title);
        holder.contentText.setText(list.get(itemposition).content);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        public TextView titleText;
        public TextView contentText;

        public Holder(View view) {
            super(view);
            titleText = view.findViewById(R.id.channel_title_rcv);
            titleText = view.findViewById(R.id.channel_content_rcv);
        }
    }
}
