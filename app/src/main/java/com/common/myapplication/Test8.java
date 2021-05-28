package com.common.myapplication;

class Test8 {
    static Test8 test8 = new Test8();

    static {
        System.out.println("-----1");
    }

    Test8() {
        System.out.println("------3");
        System.out.println("----a=" + a + "  b=" + b);
    }

    public static void show() {
        System.out.println("----4");
    }

    {
        System.out.println("----2");
    }

    int a = 100;
    static int b = 102;

}
