package com.android.test.jnidemo;

public class JniText {
    static  {
        System.loadLibrary("Hello");
    }
    public static native String sayHello();
}
