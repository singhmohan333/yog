package com.example.mohan.yog;


import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class Main2Activity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        int[] mArray = new int[20];
        mArray[0] = R.drawable.bahya;
        mArray[1] = R.drawable.download;
        mArray[2] = R.drawable.images;
        mArray[3] = R.drawable.web;
        mArray[4] = R.drawable.bahya;
        mArray[5] = R.drawable.download;
        mArray[6] = R.drawable.images;
        mArray[7] = R.drawable.web;
        mArray[8] = R.drawable.bahya;
        mArray[9] = R.drawable.download;
        mArray[10] = R.drawable.images;
        mArray[11] = R.drawable.web;


           // for(int i=0;i<=30;i++) {

                            Intent mIntent = getIntent();
                            String intValue = mIntent.getStringExtra("yog");

                ImageView imgView = (ImageView) findViewById(R.id.imageView4);

                Drawable drawable = getResources().getDrawable(mArray[intValue]);



                imgView.setImageDrawable(drawable);

    }
}
