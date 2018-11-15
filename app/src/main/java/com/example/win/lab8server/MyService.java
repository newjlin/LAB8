package com.example.win.lab8server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

        public void onCreate() {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(5000);

                        Intent intent = new Intent(MyService.this, Main2Activity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        MyService.this.startActivity(intent);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }
        @Override
        public IBinder onBind(Intent intent){return  null ;}
        @Override
        public int onStartCommand(Intent intent,int flags, int starId){
            super.onStartCommand(intent,flags,starId);
            return START_STICKY;
        }
    }


