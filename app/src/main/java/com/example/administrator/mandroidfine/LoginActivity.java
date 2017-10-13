package com.example.administrator.mandroidfine;

import android.os.Bundle;
import android.view.View;

import com.example.administrator.mandroidfine.ui.swipebacklayout.SwipeBackActivity;

/**
 * Created by Administrator on 2017/10/10.
 */
public class LoginActivity extends SwipeBackActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btnClose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
