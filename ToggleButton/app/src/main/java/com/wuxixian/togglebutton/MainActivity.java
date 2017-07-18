package com.wuxixian.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.rebound.Spring;
import com.facebook.rebound.SpringListener;
import com.facebook.rebound.SpringSystem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpringSystem springSystem=SpringSystem.create();
        Spring spring =springSystem.createSpring();
        spring.addListener(new SpringListener() {
            @Override
            public void onSpringUpdate(Spring spring) {

            }

            @Override
            public void onSpringAtRest(Spring spring) {

            }

            @Override
            public void onSpringActivate(Spring spring) {

            }

            @Override
            public void onSpringEndStateChange(Spring spring) {

            }
        })
    }
}
