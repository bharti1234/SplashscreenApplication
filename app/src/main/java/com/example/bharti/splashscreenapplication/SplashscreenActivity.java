package com.example.bharti.splashscreenapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashscreenActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Thread th = new Thread(){
        public void run()
        {
            try
            {
                Thread.sleep(4000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            finally
            {
                Intent intent = new Intent(SplashscreenActivity.this,SecondActivity.class);
                startActivity(intent);
                SplashscreenActivity.this.finish();
            }
        }
    };
        th.start();
                }

                }
