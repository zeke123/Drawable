package com.zhoujian.drawable;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    private ImageView imgeview;
    private TransitionDrawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgeview= (ImageView) findViewById(R.id.imgeview);
        Button  bt_button= (Button) findViewById(R.id.bt_button);

        bt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                drawable = (TransitionDrawable) getResources().getDrawable(R.drawable.transition_drawable);
                imgeview.setImageDrawable(drawable);
                drawable.startTransition(3000);
            }
        });

    }
}
