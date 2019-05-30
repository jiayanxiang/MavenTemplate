package com.jyx.vip.common;

/**
 * @author:jyx
 * @date:2019-05-29 17:15
 * @desc(描述):
 */
public class ThisSystemUtils {

    public static String throwIsNull(String message, String target) {
        if (target == null || (target = target.trim()).length() == 0) {
            throw new ThisSystemException(message);
        }

        return target;
    }

    public static void throwSystemException(String message) {
        if (message != null) {
            throw new ThisSystemException(message);
        }
    }
}
