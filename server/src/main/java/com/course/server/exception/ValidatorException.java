package com.course.server.exception;

/**
 * @Author V丶x
 * @Date: 2020-05-21 11:49
 * @Email: 1114005726@qq.com
 **/
public class ValidatorException extends RuntimeException {
    public ValidatorException(String message) {
        super(message);
    }
}
