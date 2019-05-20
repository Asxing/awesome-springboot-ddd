package com.holddie.framework.bean.response;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * 统一 API 响应结果集封装
 * @author HoldDie
 * @version 1.0.1
 * @email holddie@163.com
 * @date 2018/8/12 14:15
 * @update 2018/9/1 14:43:25
 */
@Data
public class Result {

    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 消息
     */
    private final String msg;
    /**
     * 数据内容，比如列表，实体
     */
    private final Object data;

    private Result(final Builder builder) {
        this.code = builder.code;
        this.msg = builder.msg;
        this.data = builder.data;
    }

    public static class Builder {
        private final Integer code;
        private String msg;
        private Object data;

        public Builder(final Integer code) {
            this.code = code;
        }

        Builder msg(final String msg) {
            this.msg = msg;
            return this;
        }

        public Builder data(final Object data) {
            this.data = data;
            return this;
        }

        public Result build() {
            return new Result(this);
        }
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
