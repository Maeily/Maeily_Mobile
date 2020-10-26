package com.example.maeily_mobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<Channel> mList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        protected TextView title;
        protected TextView content;

        public MyViewHolder(View view) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.channel_title_rcv);
            this.content = (TextView) view.findViewById(R.id.channel_content_rcv);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                }
            });
        }
    }

    public MyAdapter(FragmentActivity activity, ArrayList<Channel> list) {
        this.mList = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recyclerviewitem, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewholder, int position) {
        viewholder.title.setText(mList.get(position).getContent());
        viewholder.content.setText(mList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }
}
