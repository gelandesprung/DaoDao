package com.daodao.yanchao.daodao.subpages.data;

/**
 * Created by yanchao on 10/22/15.
 */
public class FriendsBean {
    private String name;
    private String jid;
    private String sex;
    private int age;
    private String addr;
    private String phoneNumber;
    private String photoUri;

    private FriendsBean(Builder builder) {
        name = builder.name;
        jid = builder.jid;
        sex = builder.sex;
        age = builder.age;
        addr = builder.addr;
        phoneNumber = builder.phoneNumber;
        photoUri = builder.photoUri;
    }

    public String getName() {
        return name;
    }

    public String getJid() {
        return jid;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPhotoUri() {
        return photoUri;
    }

    public static final class Builder {
        private String name;
        private String jid;
        private String sex;
        private int age;
        private String addr;
        private String phoneNumber;
        private String photoUri;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder jid(String jid) {
            this.jid = jid;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder addr(String addr) {
            this.addr = addr;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder photoUri(String photoUri) {
            this.photoUri = photoUri;
            return this;
        }

        public FriendsBean build() {
            return new FriendsBean(this);
        }
    }

}
