package com.androidbelieve.drawerwithswipetabs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by ISHU DOHARE on 22-10-2016.
 */

public class niggaadapter extends RecyclerView.Adapter<niggaadapter.MyViewHolder> {
    LayoutInflater inflater;
    List<information> data = Collections.emptyList();

    public niggaadapter(Context context,List<information> data) {
        inflater = LayoutInflater.from(context);
        this.data=data;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view= inflater.inflate(R.layout.cardlayout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        information current = data.get(position);
        holder.data1.setText(current.data1);
        holder.data2.setText(current.data2);
        holder.data3.setText(current.data3);
        holder.icon.setImageResource(current.iconid);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        TextView data1,data2,data3;
        public MyViewHolder(View itemView) {
            super(itemView);
            icon = (ImageView)itemView.findViewById(R.id.eventimg);
            data1 = (TextView)itemView.findViewById(R.id.data1);
            data2 = (TextView)itemView.findViewById(R.id.data2);
            data3 = (TextView)itemView.findViewById(R.id.data3);
        }
    }
}
