package com.daodao.yanchao.daodao;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.daodao.yanchao.daodao.subpages.ContactFragment;
import com.daodao.yanchao.daodao.subpages.LifeFragment;
import com.daodao.yanchao.daodao.subpages.MessageFragment;
import com.daodao.yanchao.daodao.subpages.UserInfoFragment;

/**
 * Created by yanchao on 10/21/15.
 */
public class MainActivity extends FragmentActivity {
    private FragmentTabHost mTabHost;


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        mTabHost.addTab(mTabHost.newTabSpec(getString(R.string.message)).setIndicator(getTabItemView
                        (getString(R.string.message), R.mipmap.messages)), MessageFragment.class, null);

        mTabHost.addTab(mTabHost.newTabSpec(getString(R.string.contacts)).setIndicator(getTabItemView
                        (getString(R.string.contacts), R.mipmap.contacts)), ContactFragment.class, null);

        mTabHost.addTab(mTabHost.newTabSpec(getString(R.string.tools)).setIndicator(getTabItemView
                        (getString(R.string.tools), R.mipmap.life)), LifeFragment.class, null);

        mTabHost.addTab(mTabHost.newTabSpec(getString(R.string.userinfo)).setIndicator(getTabItemView
                        (getString(R.string.userinfo), R.mipmap.user)), UserInfoFragment.class, null);
        mTabHost.setCurrentTab(0);
    }

    private View getTabItemView(String tip, int rid) {

        View view = getLayoutInflater().inflate(R.layout.tab_item_view, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.tab_item_image);
        imageView.setImageResource(rid);

        TextView textView = (TextView) view.findViewById(R.id.tab_item_tip);
        textView.setText(tip);

        return view;
    }
}
