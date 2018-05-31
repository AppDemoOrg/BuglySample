package com.abt.hotfix.easy;

/**
 * @描述： @加载Bug的类
 * @作者： @黄卫旗
 * @创建时间： @21/05/2018
 */
public class LoadBugClass {
    /**
     * 获取bug字符串.
     * @return 返回bug字符串
     */
    public static String getBugString() {
        BugClass bugClass = new BugClass();
        return bugClass.bug();
    }
}
