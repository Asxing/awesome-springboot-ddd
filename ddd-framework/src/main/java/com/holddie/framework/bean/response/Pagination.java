package com.holddie.framework.bean.response;

import lombok.Data;

/**
 * 分页属性
 *
 * @author HoldDie
 * @date 2019-06-27 21:14
 * @vsersion 1.0
 **/
@Data
public class Pagination {
    private Integer total;
    private Integer current;
    private Integer pageSize;

    public Pagination(int total, int number, int size) {
        this.total = total;
        this.current = number;
        this.pageSize = size;
    }
}
