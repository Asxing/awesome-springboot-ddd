package com.holddie.usercenter.repository;

import com.holddie.usercenter.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> ,MenuRepositoryCustom, QuerydslPredicateExecutor<Menu> {
    List<Menu> findAllByParentMenu_IdOrderBySortAsc(Long parentId);
}
