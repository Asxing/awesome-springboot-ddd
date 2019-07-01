package com.holddie.usercenter.repository;

import com.holddie.usercenter.domain.Menu;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class MenuRepositoryImpl extends QuerydslRepositorySupport implements MenuRepositoryCustom {
    public MenuRepositoryImpl() {
        super(Menu.class);
    }

}
