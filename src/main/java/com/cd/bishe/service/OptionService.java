package com.cd.bishe.service;

import com.cd.bishe.domain.Option;

import java.util.List;

public interface OptionService {
    int deleteByPrimaryKey(Integer optId);

    int insert(Option record);

    Option selectByPrimaryKey(Integer optId);

    List<Option> selectAll();

    int updateByPrimaryKey(Option record);
}
