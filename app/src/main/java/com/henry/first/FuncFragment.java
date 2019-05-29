package com.henry.first;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FuncFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.frame_func,container);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        TextView tv = getView().findViewById(R.id.funcTextView1);
        tv.setText("城市：    城市也叫城市聚落，是以非农业产业和非农业人口集聚形成的较大居民点。人口较稠密的地区称为城市，一般包括了住宅区、工业区和商业区并且具备行政管辖功能。城市的行政管辖功能可能涉及较其本身更广泛的区域，其中有居民区、街道、医院、学校、公共绿地、写字楼、商业卖场、广场、公园等公共设施。");
    }

}

