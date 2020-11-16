package com.vikcandroid.siwong;

import android.content.Context;
import android.widget.Toast;

public class Siwong {

    public static void showText(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
