package com.example.acerpc.guanchazhemoshi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private MyBroadRecicer reciver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        /*
        执行动态注册时只要把AndroidMainifest中的静态注册注销就可以了
        静态注册同样如此
         */
//        //动态注册广播
//        reciver = new MyBroadRecicer();
//        IntentFilter filter = new IntentFilter();
//        filter.addAction("us.buba");
//        registerReceiver(reciver, filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (reciver != null) {
            unregisterReceiver(reciver);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("str", "我是来自星星的你");
        intent.setAction("us.buba");
        //发送广播
        sendBroadcast(intent);
    }
}
