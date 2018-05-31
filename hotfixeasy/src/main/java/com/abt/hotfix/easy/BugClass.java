package com.abt.hotfix.easy;

import android.util.Log;

/**
 * @描述： @测试bug类
 * @作者： @黄卫旗
 * @创建时间： @21/05/2018
 */
public class BugClass {

    public String bug() {
        // 这段代码会报空指针异常
        String str = null;
        Log.e("BugClass", "get string length:" + str.length());
        return "This is a bug class";
    }
}
