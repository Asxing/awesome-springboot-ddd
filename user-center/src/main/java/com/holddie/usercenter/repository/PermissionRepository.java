package com.holddie.usercenter.repository;

import com.holddie.usercenter.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HoldDie
 * @date 2019-06-27 18:36
 * @vsersion 1.0
 **/
public interface PermissionRepository extends JpaRepository<Permission, Long> {

}
