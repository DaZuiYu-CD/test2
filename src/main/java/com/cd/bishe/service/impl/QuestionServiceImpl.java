package com.cd.bishe.service.impl;

import com.cd.bishe.domain.Question;
import com.cd.bishe.mapper.QuestionMapper;
import com.cd.bishe.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;
    @Override
    public int deleteByPrimaryKey(Integer questionId) {
        return questionMapper.deleteByPrimaryKey(questionId);
    }

    @Override
    public int insert(Question record) {
        return questionMapper.insert(record);
    }

    @Override
    public Question selectByPrimaryKey(Integer questionId) {
        return questionMapper.selectByPrimaryKey(questionId);
    }

    @Override
    public List<Question> selectAll() {
        return questionMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Question record) {
        return questionMapper.updateByPrimaryKey(record);
    }
}
