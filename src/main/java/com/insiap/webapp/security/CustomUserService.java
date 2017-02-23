package com.insiap.webapp.security;

import com.insiap.webapp.dao.SysUserRepository;
import com.insiap.webapp.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by Gavin on 2017/2/23.
 */
public class CustomUserService implements UserDetailsService {
    @Autowired
    SysUserRepository sysUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserRepository.findByUsername(username);
        if(sysUser == null){
            throw new UsernameNotFoundException("用户不存在！");
        }
        return sysUser;
    }
}
