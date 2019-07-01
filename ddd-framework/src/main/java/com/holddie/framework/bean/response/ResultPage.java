package com.holddie.framework.bean.response;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 结果分页
 *
 * @author HoldDie
 * @date 2019-06-27 21:12
 * @vsersion 1.0
 **/
@Data
public class ResultPage<T> {
    private List<T> list;
    private Pagination pagination;

    public ResultPage(Page<T> page) {
        this.list = page.getContent();
        this.pagination = new Pagination((int) page.getTotalElements(), page.getNumber(), page.getSize());
    }

}
