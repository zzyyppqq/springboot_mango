package com.zyp.mango.service;

import com.zyp.mango.mybatis.model.SysUser;

import java.util.List;

public interface SysUserService {

    List<SysUser> findAll();
}
