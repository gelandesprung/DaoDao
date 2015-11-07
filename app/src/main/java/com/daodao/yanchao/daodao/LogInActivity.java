package com.daodao.yanchao.daodao;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.daodao.yanchao.daodao.smack.Message.ConnState;
import com.daodao.yanchao.daodao.smack.SmackManager;

import org.jivesoftware.smack.util.StringUtils;

import de.greenrobot.event.EventBus;

/**
 * Created by yanchao on 10/21/15.
 */
public class LogInActivity extends Activity {
    Button login;
    Context mContext;

    EditText username;
    EditText passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mContext =this;

        username = (EditText) findViewById(R.id.username);
        passwd = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(loginAction);

        EventBus.getDefault().register(this);
    }

    public void onEventMainThread(ConnState state){
        if (state.getState() == ConnState.authenticated){
            Intent intent = new Intent(mContext, MainActivity.class);
            startActivity(intent);
            quit();
        }
    }
    private View.OnClickListener loginAction = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (StringUtils.isNotEmpty(username.getText())
                    && StringUtils.isNotEmpty(passwd.getText())) {
                SmackManager.getInstance().login(username.getText().toString(), passwd.getText()
                        .toString());
            }
        }
    };

    private void quit() {
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
