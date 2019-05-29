package com.henry.first;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SettingFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.frame_setting,container);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        TextView tv = getView().findViewById(R.id.settingTextView1);
        tv.setText("运动：    一种涉及体力与技巧的有一套规则或习惯所约束的活动，通常具有竞争性。是指以身体练习为基本手段，结合日光、空气、水等自然因素和健康卫生措施，达到增强体能、增进健康、丰富社会文化娱乐生活为目的的一种社会活动。");
    }

}

