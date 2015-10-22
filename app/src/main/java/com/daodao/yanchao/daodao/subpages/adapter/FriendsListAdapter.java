package com.daodao.yanchao.daodao.subpages.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.daodao.yanchao.daodao.R;
import com.daodao.yanchao.daodao.subpages.data.FriendsBean;

import java.util.List;

/**
 * Created by yanchao on 10/22/15.
 */
public class FriendsListAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private List<FriendsBean> friendsBeanList;
    public FriendsListAdapter(LayoutInflater layoutInflater, List<FriendsBean> mDataList) {
        inflater = layoutInflater;
        friendsBeanList = mDataList;
    }

    @Override
    public int getCount() {
        return friendsBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return friendsBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Bean bean;
        if (convertView == null){
            bean = new Bean();
            View view = inflater.inflate(R.layout.fragment_message_list,null);
            bean.head = (ImageView) view.findViewById(R.id.list_image);
            bean.name = (TextView) view.findViewById(R.id.list_title);
            bean.desc = (TextView) view.findViewById(R.id.list_summary);
            view.setTag(bean);
            convertView = view;
        }else {
            bean = (Bean) convertView.getTag();
        }
        //do something
        FriendsBean friendslist = (FriendsBean) getItem(position);
        bean.name.setText(friendslist.getName());
        bean.desc.setText(friendslist.getPhoneNumber());
        bean.head.setImageResource(R.mipmap.baby);
        return convertView;
    }

    class Bean{
        ImageView head;
        TextView name;
        TextView desc;
    }
}
