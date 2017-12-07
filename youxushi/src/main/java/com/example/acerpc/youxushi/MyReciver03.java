package com.example.acerpc.youxushi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by acer pc on 2017/12/6.
 */
public class MyReciver03 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String text = intent.getStringExtra("text");
        Toast.makeText(context, "我是03Reciver接收到的" + text, Toast.LENGTH_SHORT).show();
        //拦截事件
        //abortBroadcast();
        setResultData("我是改变之后的数据");
        Log.i("tag", "MyReciver03");
    }
}
