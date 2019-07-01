package com.holddie.framework.bean.response;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 相应结果生成工具
 *
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/8/12 14:16
 */
public class ResultUtil {

    private static final String DEFAULT_OK_MESSAGE = "OK";
    private static final String DEFAULT_UNAUTHORIZED_MESSAGE = "Need authorized";
    private static final String DEFAULT_METHOD_NOT_ALLOWED_MESSAGE = "Request method incorrect";

    private ResultUtil() {
        throw new IllegalStateException("can`t instance ResultUtil Class");
    }

    public static Result genOkResult() {
        return new Result
                .Builder(HttpStatus.OK.value())
                .msg(DEFAULT_OK_MESSAGE)
                .build();
    }

    public static Result genOkResult(final String msg) {
        return new Result
                .Builder(HttpStatus.OK.value())
                .msg(msg)
                .build();
    }

    public static Result genOkResult(final String msg, Object data) {
        return new Result
                .Builder(HttpStatus.OK.value())
                .msg(msg)
                .data(data)
                .build();
    }

    public static Result genOkObjectResult(Object data) {
        return new Result
                .Builder(HttpStatus.OK.value())
                .msg(DEFAULT_OK_MESSAGE)
                .data(data)
                .build();
    }

    public static Result genOkMapValueResult(String dataKey, Object dataValue) {
        return genOkMapValueResult(dataKey, dataValue, DEFAULT_OK_MESSAGE);
    }

    public static Result genOkMapValueResult(String dataKey, Object dataValue, final String msg) {
        Map<String, Object> map = new HashMap<>(8);
        map.put(dataKey, dataValue);
        return new Result
                .Builder(HttpStatus.OK.value())
                .msg(msg)
                .data(map)
                .build();
    }

    public static Result genFailedResult(final String msg) {
        return new Result
                .Builder(HttpStatus.BAD_REQUEST.value())
                .msg(msg)
                .build();
    }

    public static Result genFailedResult(final String msg, final Object data) {
        return new Result
                .Builder(HttpStatus.BAD_REQUEST.value())
                .msg(msg)
                .data(data)
                .build();
    }

    public static Result genFailedResult(final String msg, final Integer code) {
        return new Result
                .Builder(code)
                .msg(msg)
                .build();
    }

    public static Result genFailedResult(final String msg, final Object data, final Integer code) {
        return new Result
                .Builder(code)
                .msg(msg)
                .data(data)
                .build();
    }

    public static Result genMethodErrorResult() {
        return new Result
                .Builder(HttpStatus.METHOD_NOT_ALLOWED.value())
                .msg(DEFAULT_METHOD_NOT_ALLOWED_MESSAGE)
                .build();
    }

    public static Result genUnauthorizedResult() {
        return new Result
                .Builder(HttpStatus.UNAUTHORIZED.value())
                .msg(DEFAULT_UNAUTHORIZED_MESSAGE)
                .build();
    }

    public static Result genUnauthorizedResult(final String msg) {
        return new Result
                .Builder(HttpStatus.UNAUTHORIZED.value())
                .msg(msg)
                .build();
    }

    public static Result genInternalServerErrorResult(final String url) {
        return new Result
                .Builder(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .msg("API [" + url + "] internal server error. Please call engineer to debug.")
                .build();
    }

    public static ResultPage genOkResultPage(Page page) {
        return new ResultPage(page);
    }
}
