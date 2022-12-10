LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_LDLIBS :=-llog
# 定义生成的so库名称（Hello.so），以及编译该库包含的源文件，
LOCAL_MODULE  := Hello
# 定义生成的so库名称（Hello.so），以及编译该库包含的源文件，
LOCAL_SRC_FILES := JNIHello.cpp


# 定义生成动态so库
include $(BUILD_SHARED_LIBRARY)
