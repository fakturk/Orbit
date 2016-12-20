package com.unist.netlab.fakturk.orbit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    BigCircleView bigCircleView;
    TargetCircleView targetCircleView;
    SmallCircleView smallCircleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bigCircleView = (BigCircleView) findViewById(R.id.bigCircleView);
        smallCircleView = (SmallCircleView) findViewById(R.id.smallCircleView);
        targetCircleView = (TargetCircleView) findViewById(R.id.targetView);
        Timer t=new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                smallCircleView.setTheta(smallCircleView.getTheta()+10);
//                smallCircleView.invalidate();
            }
        };
//        t.schedule(task, 0, 20);
        t.scheduleAtFixedRate(task,0,1);

    }
}
