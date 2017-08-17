package com.qzw.githubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.qzw.opensourcelibrary.StringUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        tv_name.setText(StringUtils.getMyName());
    }
}
