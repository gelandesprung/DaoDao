package com.daodao.yanchao.daodao.subpages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daodao.yanchao.daodao.R;

/**
 * Created by yanchao on 10/21/15.
 */
public class UserInfoFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_userinfo,null);
        TextView title = (TextView) view.findViewById(R.id.title);
        title.setText(R.string.userinfo);
        return view;
    }
}
