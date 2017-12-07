package com.example.acerpc.youxushi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
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
        abortBroadcast();
    }
}
