package com.cd.bishe.service.impl;

import com.cd.bishe.domain.Option;
import com.cd.bishe.mapper.OptionMapper;
import com.cd.bishe.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionServiceImpl implements OptionService {
    @Autowired
    private OptionMapper optionMapper;
    @Override
    public int deleteByPrimaryKey(Integer optId) {
        return optionMapper.deleteByPrimaryKey(optId);
    }

    @Override
    public int insert(Option record) {
        return optionMapper.insert(record);
    }

    @Override
    public Option selectByPrimaryKey(Integer optId) {
        return optionMapper.selectByPrimaryKey(optId);
    }

    @Override
    public List<Option> selectAll() {
        return optionMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Option record) {
        return optionMapper.updateByPrimaryKey(record);
    }
}
