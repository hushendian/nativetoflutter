package com.common.myapplication;

class Test1 {

    private Test1() {
    }

    private static class ViewHolder {
        final static Test1 test = new Test1();
    }

    public static Test1 getInstance() {
        return ViewHolder.test;
    }

}
