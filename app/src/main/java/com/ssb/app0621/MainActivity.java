package com.ssb.app0621;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ani1 =(Button)findViewById(R.id.ani1);
        ani1.setOnClickListener((view)->{
            //애니메이션을 가져오기
            Animation anim =
                    AnimationUtils.loadAnimation(MainActivity.this,R.anim.scaleanim);
            //애니메이션 실행
            view.startAnimation(anim);
        });

        Button ani2 =(Button)findViewById(R.id.ani2);
        ani2.setOnClickListener((view)->{
            //애니메이션을 가져오기
            Animation anim =
                    AnimationUtils.loadAnimation(MainActivity.this,R.anim.setanim);
            //애니메이션 실행
            view.startAnimation(anim);
        });

        }

    //회전 감지 메소드
    //Overriding 할 때 메소드가 추상메소드가 아니라면
    //상위 클래스의 메소드를 호출해주는 것이 좋습니다.
    @Override
    public void onConfigurationChanged(Configuration newConfig){
        Toast.makeText(MainActivity.this,"회전발생",Toast.LENGTH_LONG).show();
        super.onConfigurationChanged(newConfig);
    }
}
