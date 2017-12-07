package com.example.acerpc.youxushi;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private MyReciver01 reciver01;
    private MyReciver02 reciver02;
    private MyReciver03 reciver03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent("us.mifeng.cc");
        intent.putExtra("text", "我是用来发送数据的");
        //发送无序广播，无序广播不能拦截
        //sendBroadcast(intent);
        sendOrderedBroadcast(intent, null);
    }

    @Override
    protected void onResume() {
        super.onResume();
        reciver01 = new MyReciver01();
        reciver02 = new MyReciver02();
        reciver03 = new MyReciver03();

        IntentFilter filter01 = new IntentFilter("us.mifeng.cc");
        filter01.setPriority(10);
        registerReceiver(reciver01, filter01);

        IntentFilter filter02 = new IntentFilter("us.mifeng.cc");
        filter02.setPriority(5);
        registerReceiver(reciver02, filter02);

        IntentFilter filter03 = new IntentFilter("us.mifeng.cc");
        filter03.setPriority(20);
        registerReceiver(reciver03, filter03);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (reciver01 != null) {
            unregisterReceiver(reciver01);
        }
        if (reciver02 != null) {
            unregisterReceiver(reciver02);
        }
        if (reciver03 != null) {
            unregisterReceiver(reciver03);
        }
    }
}
