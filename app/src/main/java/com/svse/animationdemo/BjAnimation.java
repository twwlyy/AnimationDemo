package com.svse.animationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by 李云云 on 2017/9/13.
 */

public class BjAnimation extends Activity implements View.OnClickListener {
    private ImageView img;
    private Button button1,button2,button3,button4,button5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bjanmation);
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

        //这个意思是点击事件不随着View的改变而改变

//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(BjAnimation.this, "点击了图片", Toast.LENGTH_SHORT).show();
//            }
//        });



    }

    @Override
    public void onClick(View view) {
        if (view==button1){
            //透明
            AlphaAnimation animation=new AlphaAnimation(1f,0f);
            //设置时长
            animation.setDuration(2*1000);
            //动画完成后是否保持
            animation.setFillAfter(true);
            //开始动画
            img.startAnimation(animation);
        }else if (view==button2){
            //缩放
            ScaleAnimation scaleAnimation=new ScaleAnimation(1.0f,1.5f,1.0f,1.5f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            //设置时长
            scaleAnimation.setDuration(2*1000);
            //动画完成后是否保持
            scaleAnimation.setFillAfter(true);
            //开始动画
            img.startAnimation(scaleAnimation);
        }else if (view==button3){
            //旋转
            RotateAnimation rotateAnimation=new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            //设置时长
            rotateAnimation.setDuration(2*1000);
            //动画完成后是否保持
            rotateAnimation.setFillAfter(true);
           //中断器
            rotateAnimation.setInterpolator(new AccelerateInterpolator());
            //开始动画
            img.startAnimation(rotateAnimation);
        }else if (view==button4){
            //位移
            TranslateAnimation translateAnimation=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0f,Animation.RELATIVE_TO_SELF,0.5f);
            //设置时长
            translateAnimation.setDuration(2*1000);
            //动画完成后是否保持
            translateAnimation.setFillAfter(true);
            //开始动画
            img.startAnimation(translateAnimation);

        }else {
            //透明
            AlphaAnimation animation=new AlphaAnimation(1f,0f);
            //设置时长
            animation.setDuration(2*1000);

            //缩放
            ScaleAnimation scaleAnimation=new ScaleAnimation(1.0f,1.5f,1.0f,1.5f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            //设置时长
            scaleAnimation.setDuration(2*1000);

            //旋转
            RotateAnimation rotateAnimation=new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            //设置时长
            rotateAnimation.setDuration(2*1000);

            //位移
            TranslateAnimation translateAnimation=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0f,Animation.RELATIVE_TO_SELF,0.3f,Animation.RELATIVE_TO_SELF,0f,Animation.RELATIVE_TO_SELF,0.3f);
            //设置时长
            translateAnimation.setDuration(2*1000);

            //综合
            AnimationSet animationSet=new AnimationSet(true);
            animationSet.addAnimation(animation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(rotateAnimation);
            animationSet.addAnimation(translateAnimation);

            img.startAnimation(animationSet);


        }

    }
}
