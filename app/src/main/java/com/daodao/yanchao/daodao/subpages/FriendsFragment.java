package com.daodao.yanchao.daodao.subpages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.daodao.yanchao.daodao.R;
import com.daodao.yanchao.daodao.activities.ChatActiivty;
import com.daodao.yanchao.daodao.smack.SmackManager;
import com.daodao.yanchao.daodao.subpages.adapter.FriendsListAdapter;
import com.daodao.yanchao.daodao.subpages.data.FriendsBean;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanchao on 10/22/15.
 */
public class FriendsFragment extends Fragment{

    private ListView listView;
    private FriendsListAdapter adapter;
    private List<FriendsBean> mDataList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDataList = new ArrayList<>();
        adapter = new FriendsListAdapter(getLayoutInflater(savedInstanceState),mDataList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_friends,null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = (ListView) view.findViewById(R.id.friends_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ChatActiivty.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
//        test();
        mDataList.addAll(SmackManager.getInstance().getFriendList());
        adapter.notifyDataSetChanged();
    }

    private void test() {
        mDataList.clear();
        mDataList.add(new FriendsBean.Builder().name("yanchao").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("petrol").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("china").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("union").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("fish").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("element").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("dog").phoneNumber("53445435435").build());
        mDataList.add(new FriendsBean.Builder().name("cat").phoneNumber("54535").build());
        mDataList.add(new FriendsBean.Builder().name("watch").phoneNumber("fddfdsdfds").build());
        mDataList.add(new FriendsBean.Builder().name("erwe").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("gold").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("3423").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("yanchao").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("yanchao").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("yanchao").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("yanchao").phoneNumber("15201400831").build());
        mDataList.add(new FriendsBean.Builder().name("yanchao").phoneNumber("15201400831").build());
        adapter.notifyDataSetChanged();
    }
}
