package com.example.acerpc.guanchazhemoshi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by acer pc on 2017/12/6.
 */
public class MyBroadRecicer extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "sssssss", Toast.LENGTH_SHORT).show();
        ;
    }
}
