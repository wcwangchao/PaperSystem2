package com.service;


import com.pojo.CbtUser;
import com.pojo.Paper;

import java.util.List;

public interface CbtUserService {
    int deleteByPrimaryKey(Long id);

    int insert(CbtUser record);

    int insertSelective(CbtUser record);

    CbtUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CbtUser record);

    int updateByPrimaryKeyWithBLOBs(CbtUser record);

    int updateByPrimaryKey(CbtUser record);

}
