package com.daodao.yanchao.daodao.subpages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.daodao.yanchao.daodao.R;
import com.daodao.yanchao.daodao.subpages.adapter.GroupsListAdapter;
import com.daodao.yanchao.daodao.subpages.data.GroupsBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanchao on 10/22/15.
 */
public class GroupsFragment extends Fragment {


    private ListView listView;
    private GroupsListAdapter adapter;
    private List<GroupsBean> mDataList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDataList = new ArrayList<>();
        adapter = new GroupsListAdapter(getLayoutInflater(savedInstanceState),mDataList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_groups,null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = (ListView) view.findViewById(R.id.groups_list);
        listView.setAdapter(adapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        test();
    }

    private void test() {
        mDataList.clear();
        mDataList.add(new GroupsBean.Builder().groupname("移动业务部").desc("研发业务群").build());
        mDataList.add(new GroupsBean.Builder().groupname("人力资源").desc("人才招聘").build());
        mDataList.add(new GroupsBean.Builder().groupname("研发部").desc("研发成员组").build());
        mDataList.add(new GroupsBean.Builder().groupname("法律咨询").desc("法律业务相关").build());
        mDataList.add(new GroupsBean.Builder().groupname("公积金").desc("公积金办理").build());
        mDataList.add(new GroupsBean.Builder().groupname("保险报销").desc("出差、加班报销").build());
        mDataList.add(new GroupsBean.Builder().groupname("android研发团队").desc("android研发成员").build
                ());
        mDataList.add(new GroupsBean.Builder().groupname("ios研发团队").desc("ios研发团队成员").build());
        mDataList.add(new GroupsBean.Builder().groupname("车队").desc("班车司机").build());
        mDataList.add(new GroupsBean.Builder().groupname("工会").desc("工会活动").build());
        mDataList.add(new GroupsBean.Builder().groupname("食堂").desc("食堂菜品").build());
        adapter.notifyDataSetChanged();
    }
}
