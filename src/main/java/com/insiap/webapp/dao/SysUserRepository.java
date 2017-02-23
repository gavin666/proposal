package com.insiap.webapp.dao;

import com.insiap.webapp.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Gavin on 2017/2/23.
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long> {
    SysUser findByUsername(String username);
}
