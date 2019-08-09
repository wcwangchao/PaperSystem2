package com.service.impl;

import com.pojo.Paper;
import com.dao.PaperDao;
import com.service.PaperService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperDao paperDao;

    @Override
    public int addPaper(Paper paper) {
        return paperDao.addPaper(paper);
    }

    @Override
    public int deletePaperById(long id) {
        return paperDao.deletePaperById(id);
    }

    @Override
    public int updatePaper(Paper paper) {
        return paperDao.updatePaper(paper);
    }

    @Override
    public Paper queryById(long id) {
        Paper paper = paperDao.queryById(id);
        return paper;
    }

    @Override
    public List<Paper> queryAllPaper() {
        List<Paper> list = paperDao.queryAllPaper();
        return list;
    }

}