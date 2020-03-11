package com.macro.mall.dao;

import com.macro.mall.dto.MemberDto;

import java.util.List;

public interface AdminDao {
    List<MemberDto> getAllMember();
}
