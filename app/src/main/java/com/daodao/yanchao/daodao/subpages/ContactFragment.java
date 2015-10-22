package com.daodao.yanchao.daodao.subpages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daodao.yanchao.daodao.R;

/**
 * Created by yanchao on 10/21/15.
 */
public class ContactFragment extends Fragment {
    private FragmentTabHost tabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, null);

        TextView title = (TextView) view.findViewById(R.id.title);
        title.setText(R.string.contacts);

        tabHost = (FragmentTabHost) view.findViewById(android.R.id.tabhost);
        tabHost.setup(getActivity(),getChildFragmentManager(),android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec(getString(R.string.friends)).setIndicator(getString(R
                .string.friends),null), FriendsFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec(getString(R.string.groups)).setIndicator(getString(R
                .string.groups),null),GroupsFragment.class,null);
        tabHost.setCurrentTab(0);
        return view;
    }
}
