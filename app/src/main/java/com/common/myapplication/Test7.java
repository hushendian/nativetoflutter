package com.common.myapplication;

import android.util.Log;

class Test7 {

    static Object object = new Object();
    static int count = 0;


    static class Thread1 implements Runnable {

        @Override
        public void run() {
            synchronized (object) {
                for (int i = 0; i < 10; i++) {
                    Log.d("hsd", " Thread1  run: ");
                    count++;
                }
                Log.d("hsd", "Thread1    run: " + count);
            }


        }
    }

    static class Thread2 implements Runnable {

        @Override
        public void run() {

            synchronized (object) {
                for (int i = 0; i < 10; i++) {
                    Log.d("hsd", "Thread2    run: ");
                    count++;
                }
            }
            Log.d("hsd", "Thread2    run: " + count);
        }
    }


    public static void main() {

        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



    }
}
