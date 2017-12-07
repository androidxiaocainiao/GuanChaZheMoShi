package com.example.acerpc.youxushi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by acer pc on 2017/12/6.
 */
public class MyReciver01 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String text = getResultData();
        //String text = intent.getStringExtra("text");
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        Log.i("tag", "MyReciver01");
        /*
        abortBroadcast()广播拦截
        拦截时只会拦截后面的一个广播
        列：有3个广播分别为1号,2号,3号,
            在1号中设置广播拦截
            在执行时则会执行1号和3号
            而2号则会被拦截不被执行
         */
        abortBroadcast();
    }
}
