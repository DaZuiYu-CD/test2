package com.cd.bishe.service.impl;

import com.cd.bishe.mapper.KnowledgeMapper;
import com.cd.bishe.domain.Knowledge;
import com.cd.bishe.service.KnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Repository("knowledgeService")
public class KnowledgeServiceImpl implements KnowledgeService {

    @Autowired
    private KnowledgeMapper knowledgeMapper;
    @Override
    public int deleteByPrimaryKey(Integer kId) {
        return knowledgeMapper.deleteByPrimaryKey(kId);
    }

    @Override
    public int insert(Knowledge record) {
        return knowledgeMapper.insert(record);
    }

    @Override
    public Knowledge selectByPrimaryKey(Integer kId) {
        return knowledgeMapper.selectByPrimaryKey(kId);
    }

    @Override
    public List<Knowledge> selectAll() {
        return knowledgeMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Knowledge record) {
        return knowledgeMapper.updateByPrimaryKey(record);
    }
}
