package com.daodao.yanchao.daodao.subpages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.daodao.yanchao.daodao.R;
import com.daodao.yanchao.daodao.subpages.adapter.MessageListAdapter;
import com.daodao.yanchao.daodao.subpages.data.MessageBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanchao on 10/21/15.
 */
public class MessageFragment extends Fragment {
    ListView messageList;
    MessageListAdapter adapter;
    List<MessageBean> messageBeanList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message,null);
        TextView title = (TextView) view.findViewById(R.id.title);
        title.setText(R.string.message);

        messageList = (ListView) view.findViewById(R.id.newmessage_list);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        messageBeanList = new ArrayList<>();
        adapter = new MessageListAdapter(getLayoutInflater(savedInstanceState),messageBeanList);
        messageList.setAdapter(adapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        test();
    }


    //test data
    void test(){
        messageBeanList.clear();
        messageBeanList.add(new MessageBean(null, "研发中心", "不得了啦～～～～"));
        messageBeanList.add(new MessageBean(null, "数据中心", "不得了啦～～～～"));
        messageBeanList.add(new MessageBean(null, "控制中心", "不得了啦～～～～"));
        messageBeanList.add(new MessageBean(null,"诗集呜呼哀哉", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"飞翔组", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"生活", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"工作", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"岁", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"疑难杂症", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"礵", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"诗集呜呼哀哉", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"礵", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"奇趣", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"陙", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"加压", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"好吧", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"最后三个了", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"情趣", "come on～～～～"));
        messageBeanList.add(new MessageBean(null,"人生啊", "come on～～～～"));
        adapter.notifyDataSetChanged();
    }
}
