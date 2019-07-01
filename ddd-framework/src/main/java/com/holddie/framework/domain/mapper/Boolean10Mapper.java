package com.holddie.framework.domain.mapper;

import org.springframework.stereotype.Component;

@Component
public class Boolean10Mapper {

    public Integer asInteger(Boolean bool) {
        return null == bool ?
                0 : (bool ? 1 : 0);
    }

    public Boolean asBoolean(Integer bool) {
        return null == bool ?
                null : (bool > 0 ?
                Boolean.TRUE : Boolean.FALSE
        );
    }
}
