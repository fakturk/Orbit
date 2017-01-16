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


        TimerTask myTimerTask = new TimerTask() {
            @Override
            public void run() {
                // Update logic here

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // Drawing logic here
                        smallCircleView.setTheta(smallCircleView.getTheta()+10);

                    }
                });
            }
        };
        Timer timer = new Timer();
        timer.schedule(myTimerTask, 10, 50);

    }
}
