package com.cd.bishe.service;


import com.cd.bishe.domain.Knowledge;

import java.util.List;

public interface KnowledgeService {
    int deleteByPrimaryKey(Integer kId);

    int insert(Knowledge record);

    Knowledge selectByPrimaryKey(Integer kId);

    List<Knowledge> selectAll();

    int updateByPrimaryKey(Knowledge record);
}
