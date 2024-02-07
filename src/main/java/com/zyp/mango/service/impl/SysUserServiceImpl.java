package com.zyp.mango.service.impl;

import com.zyp.mango.mybatis.dao.SysUserMapper;
import com.zyp.mango.mybatis.model.SysUser;
import com.zyp.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }
}
