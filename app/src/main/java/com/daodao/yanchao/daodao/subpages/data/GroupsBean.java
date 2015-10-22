package com.daodao.yanchao.daodao.subpages.data;

/**
 * Created by yanchao on 10/22/15.
 */
public class GroupsBean {
    private String groupname;
    private String group_id;
    private String photoUri;
    private String desc;

    public String getGroupname() {
        return groupname;
    }

    public String getGroup_id() {
        return group_id;
    }

    public String getPhotoUri() {
        return photoUri;
    }

    public String getDesc() {
        return desc;
    }

    private GroupsBean(Builder builder) {
        groupname = builder.groupname;
        group_id = builder.group_id;
        photoUri = builder.photoUri;
        desc = builder.desc;
    }

    public static final class Builder {
        private String groupname;
        private String group_id;
        private String photoUri;
        private String desc;

        public Builder() {
        }

        public Builder groupname(String groupname) {
            this.groupname = groupname;
            return this;
        }

        public Builder group_id(String group_id) {
            this.group_id = group_id;
            return this;
        }

        public Builder photoUri(String photoUri) {
            this.photoUri = photoUri;
            return this;
        }

        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public GroupsBean build() {
            return new GroupsBean(this);
        }
    }
}
