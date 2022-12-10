package com.android.test.jnidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String result=JniText.sayHello();
        // 打印JNI本地方法返回的字符串。
        Log.d(TAG, "the string from JNC C '"+result + "'");
    }
}