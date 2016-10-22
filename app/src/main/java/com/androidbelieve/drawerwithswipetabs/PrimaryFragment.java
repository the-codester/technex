package com.androidbelieve.drawerwithswipetabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;;import java.util.ArrayList;
import java.util.List;

public class PrimaryFragment extends Fragment {
    niggaadapter adapter;

RecyclerView recyclerview;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View layout=inflater.inflate(R.layout.primary_layout,null);

        recyclerview = (RecyclerView) layout.findViewById(R.id.rv);
        adapter = new niggaadapter(getActivity(), getdata());
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        return layout;
    }
public static List<information> getdata()
{
    List<information> data = new ArrayList<>();
    int[] icons={R.drawable.eventssizeable,R.drawable.eventssizeable,R.drawable.eventssizeable,R.drawable.eventssizeable,R.drawable.eventssizeable,R.drawable.eventssizeable,R.drawable.eventssizeable};
    String data1array[]={"data1_1","data1_1","data1_1","data1_1","data1_1","data1_1","data1_1"};
    String data2array[]={"data2_1","data2_1","data2_1","data2_1","data2_1","data2_1","data2_1",};
    String data3array[] = {"data3_1", "data3_1", "data3_1", "data3_1", "data3_1", "data3_1", "data3_1",};
    int i;
    for(i=0;i<icons.length;i++)
    {
        information current=new information();
        current.iconid=icons[i];
        current.data1=data1array[i];
        current.data2=data2array[i];
        current.data3=data3array[i];
        data.add(current);

    }
    return data;

}
}
