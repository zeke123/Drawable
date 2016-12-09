package com.zhoujian.drawable;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    private ImageView imgeview;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgeview= (ImageView) findViewById(R.id.imgView);
        ClipDrawable mScaleDrawable  =(ClipDrawable)imgeview.getDrawable();
        mScaleDrawable.setLevel(5000);
    }
}
