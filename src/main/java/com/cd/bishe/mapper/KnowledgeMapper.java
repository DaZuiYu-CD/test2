package com.cd.bishe.mapper;

import com.cd.bishe.domain.Knowledge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface KnowledgeMapper {
    int deleteByPrimaryKey(Integer kId);

    int insert(Knowledge record);

    Knowledge selectByPrimaryKey(Integer kId);

    List<Knowledge> selectAll();

    int updateByPrimaryKey(Knowledge record);
}