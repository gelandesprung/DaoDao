package com.daodao.yanchao.daodao.subpages.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.daodao.yanchao.daodao.R;
import com.daodao.yanchao.daodao.subpages.data.MessageBean;

import java.net.URI;
import java.util.List;

/**
 * Created by yanchao on 10/21/15.
 */
public class MessageListAdapter extends BaseAdapter {
    private final LayoutInflater layoutInflater;
    List<MessageBean>  mData;
    public MessageListAdapter(LayoutInflater inflater, List<MessageBean> messageBeanList) {
        mData = messageBeanList;
        layoutInflater = inflater;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Bean bean;
        if (convertView == null){
            View view = layoutInflater.inflate(R.layout.fragment_message_list,null);
            bean = new Bean();
            bean.setImageView((ImageView) view.findViewById(R.id.list_image));
            bean.setTitle((TextView) view.findViewById(R.id.list_title));
            bean.setSummary((TextView) view.findViewById(R.id.list_summary));
            view.setTag(bean);
            convertView = view;
        }else {
            bean = (Bean) convertView.getTag();
        }

        //set data
        MessageBean messageBean = (MessageBean) getItem(position);
        bean.imageView.setImageResource(R.mipmap.groupchat_icon);
        bean.summary.setText(messageBean.getmSummary());
        bean.title.setText(messageBean.getmTitle());
        return convertView;
    }


     class Bean {
        ImageView imageView;
        TextView title;
        TextView summary;

        public ImageView getImageView() {
            return imageView;
        }

        public void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        public void setTitle(TextView title) {
            this.title = title;
        }

        public void setSummary(TextView summary) {
            this.summary = summary;
        }
    }
}
