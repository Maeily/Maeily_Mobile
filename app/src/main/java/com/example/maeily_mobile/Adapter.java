package com.example.maeily_mobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    String title[], content[];
    Context context;

    public Adapter(Context ct, String s1[], String s2[]){
        context = ct;
        title = s1;
        content = s2;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyclerviewitem,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        holder.channel_title_rcv.setText(title[position]);
        holder.channel_content_rcv.setText(title[position]);
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView channel_title_rcv;
        TextView channel_content_rcv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            channel_title_rcv = itemView.findViewById(R.id.channel_title_rcv);
            channel_content_rcv = itemView.findViewById(R.id.channel_content_rcv);
        }
    }
}
