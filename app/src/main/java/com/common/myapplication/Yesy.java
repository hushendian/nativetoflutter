package com.common.myapplication;

public class Yesy {


    public Yesy instance() {
        return ViewHolder.getInstance;
    }

    private static class ViewHolder {
        private static final Yesy getInstance = new Yesy();
    }


    private static  volatile  Yesy instance=null;

    public  static  Yesy getInstance(){
        if(instance==null){
            synchronized (Yesy.class){
                if(instance==null){
                     instance= new Yesy();
                }
            }
        }
        return instance;
    }
}
