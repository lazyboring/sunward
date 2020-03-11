package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dao.AdminDao;
import com.macro.mall.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "AdminControl",description = "管理")
@RequestMapping("/admin")
public class AdminControl {
    @Autowired
    private AdminService adminService;


    @ApiOperation()
    @RequestMapping(value = "/member")
    public CommonResult<AdminDao> getMember(){
        adminService.getAll()
    }

}