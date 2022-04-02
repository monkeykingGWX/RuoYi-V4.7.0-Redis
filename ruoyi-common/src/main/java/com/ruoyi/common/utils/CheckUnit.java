package com.ruoyi.common.utils;

import java.util.List;

/**
 * @author Gwx@704835519@qq.com
 * @create 2021-10-26 19:29
 */
public class CheckUnit {

    public static boolean isNull (Object obj) {
        return obj == null;
    }

    public static boolean isBetween (int val, int min, int max) {
        return val >= min && val <= max;
    }

    public static boolean isBetween (String str, int min, int max) throws NullPointerException
    {
        int len = str.length();

        return len >= min && len <= max;
    }

    public static boolean isBetween (List list, int min, int max ) throws NullPointerException
    {
        return list.size() >= min && list.size() <= max;
    }

    public static boolean hasSpecialChars (String str, String[] specialChars) throws NullPointerException
    {
        for (String aChar : specialChars) {
            if (str.contains(aChar)) {
                return true;
            }
        }

        return false;
    }

    public static boolean regexpMatch (String str, String regexp) throws NullPointerException
    {
        return str.matches(regexp);
    }

    public static boolean isEmpty (String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isEmpty (List list)
    {
        return list == null || list.size() == 0;
    }
}
