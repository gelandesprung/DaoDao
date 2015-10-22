package com.daodao.yanchao.daodao.subpages.data;

import java.net.URI;

/**
 * Created by yanchao on 10/21/15.
 */
public class MessageBean {
    URI mIcon;
    String mTitle;
    String mSummary;


    public MessageBean(URI mIcon, String mTitle, String mSummary) {
        this.mIcon = mIcon;
        this.mTitle = mTitle;
        this.mSummary = mSummary;
    }

    public URI getmIcon() {
        return mIcon;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSummary() {
        return mSummary;
    }
}
