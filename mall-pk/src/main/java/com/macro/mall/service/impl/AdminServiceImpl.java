package com.macro.mall.service.impl;

import com.macro.mall.dao.AdminDao;
import com.macro.mall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : niec
 * @description
 * @date : 2020-03-11 17:57
 */
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public void getAll() {
        adminDao
    }
}
