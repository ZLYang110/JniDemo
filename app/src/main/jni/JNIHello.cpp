
//
// Created by on 2022/12/10.
//
#include "android_utils.h"
#include "com_android_test_jnidemo_JniText.h"



extern "C" JNIEXPORT jstring JNICALL Java_com_android_test_jnidemo_JniText_sayHello
   (JNIEnv *env, jclass type){
    LOGD("Hello World JNI LOG");
 return env->NewStringUTF("Hello World From JNI!!!!!");
}