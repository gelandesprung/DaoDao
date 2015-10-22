package com.daodao.yanchao.daodao.subpages.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.daodao.yanchao.daodao.R;
import com.daodao.yanchao.daodao.subpages.data.GroupsBean;

import java.util.List;

/**
 * Created by yanchao on 10/22/15.
 */
public class GroupsListAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private List<GroupsBean> groupsBeanList;
    public GroupsListAdapter(LayoutInflater layoutInflater, List<GroupsBean> mDataList) {
        inflater = layoutInflater;
        groupsBeanList = mDataList;
    }

    @Override
    public int getCount() {
        return groupsBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return groupsBeanList.get(position);
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
        GroupsBean groupslist = (GroupsBean) getItem(position);
        bean.name.setText(groupslist.getGroupname());
        bean.desc.setText(groupslist.getDesc());
        bean.head.setImageResource(R.mipmap.user_group);
        return convertView;
    }

    class Bean{
        ImageView head;
        TextView name;
        TextView desc;
    }
}
