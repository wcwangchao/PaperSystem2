package com.service.impl;

import com.dao.CbtUserMapper;
import com.pojo.CbtUser;
import com.service.CbtUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CbtUserServiceImpl implements CbtUserService {

    @Autowired
    private CbtUserMapper cbtUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cbtUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CbtUser record) {
        return cbtUserMapper.insert(record);
    }

    @Override
    public int insertSelective(CbtUser record) {
        return cbtUserMapper.insertSelective(record);
    }

    @Override
    public CbtUser selectByPrimaryKey(Long id) {
        return cbtUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CbtUser record) {
        return cbtUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(CbtUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CbtUser record) {
        return 0;
    }
}
