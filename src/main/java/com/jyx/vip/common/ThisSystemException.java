package com.jyx.vip.common;

/**
 * @author:jyx
 * @date:2019-05-29 17:16
 * @desc(描述):
 */
public class ThisSystemException extends RuntimeException {

    public ThisSystemException(String message) {
        super(message);
    }

    public ThisSystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
