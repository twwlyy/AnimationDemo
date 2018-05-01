package com.svse.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.img);
        button = (Button) findViewById(R.id.but);
        //提取帧动画
        animationDrawable = (AnimationDrawable) imageView.getBackground();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //开始动画

                //判断一下如果正在运行先停止  否则开始的动画
                if (animationDrawable.isRunning())
                    animationDrawable.stop();
                else
                    animationDrawable.start();
            }
        });
    }
}
