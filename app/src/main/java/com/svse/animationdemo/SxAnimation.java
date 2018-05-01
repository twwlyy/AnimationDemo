package com.svse.animationdemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by 李云云 on 2017/9/13.
 */

public class SxAnimation extends Activity implements View.OnClickListener{
    private ImageView img;
    private Button button1,button2,button3,button4,button5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sxanimation);
        img=findViewById(R.id.img);
        button1=findViewById(R.id.but1);
        button2=findViewById(R.id.but2);
        button3=findViewById(R.id.but3);
        button4=findViewById(R.id.but4);
        button5=findViewById(R.id.but5);

        //设置监听
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        //这个意思是点击事件随着View的改变而改变

//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(SxAnimation.this, "点击了图片", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        if (view==button1){
            //透明
            ObjectAnimator aAmin=ObjectAnimator.ofFloat(img,"alpha",1f,0.5f,1f,0.5f,0.8f);
            //设置时长
            aAmin.setDuration(5*1000);
            aAmin.start();
        }else if (view==button2){
            //缩放
            ObjectAnimator sAmin=ObjectAnimator.ofFloat(img,"scaleX",1f,2f,3f,1f);
            //设置时长
            sAmin.setDuration(5*1000);
            sAmin.start();
        }else if (view==button3){
            //旋转
            ObjectAnimator rAmin=ObjectAnimator.ofFloat(img,"rotationX",0f,360f);
            //设置时长
            rAmin.setDuration(5*1000);
            rAmin.start();
        }else if (view==button4){
            //位移
            ObjectAnimator tAmin=ObjectAnimator.ofFloat(img,"translationX",0f,100f,200f,300f,100f,200f,500f);
            //设置时长
            tAmin.setDuration(5*1000);
            tAmin.start();


        }else {
            //综合

            //位移
            ObjectAnimator tAmin=ObjectAnimator.ofFloat(img,"translationX",0f,100f,200f,300f,100f,200f,500f);
            //设置时长
            tAmin.setDuration(5*1000);
//            tAmin.start();

            //旋转
            ObjectAnimator rAmin=ObjectAnimator.ofFloat(img,"rotationX",0f,360f);
            //设置时长
            rAmin.setDuration(5*1000);
//            rAmin.start();

            AnimatorSet animatorSet=new AnimatorSet();
            animatorSet.playTogether(tAmin,rAmin);
            animatorSet.start();


        }


    }
}
