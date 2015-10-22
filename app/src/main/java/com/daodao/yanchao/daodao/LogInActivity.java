package com.daodao.yanchao.daodao;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by yanchao on 10/21/15.
 */
public class LogInActivity extends Activity {
    Button login;
    Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mContext =this;

        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(loginAction);
    }

    private View.OnClickListener loginAction = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(mContext,MainActivity.class);
            startActivity(intent);
            quit();
        }
    };

    private void quit() {
        finish();
    }
}
