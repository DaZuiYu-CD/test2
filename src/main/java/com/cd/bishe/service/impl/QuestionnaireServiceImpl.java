package com.cd.bishe.service.impl;

import com.cd.bishe.domain.Questionnaire;
import com.cd.bishe.mapper.QuestionnaireMapper;
import com.cd.bishe.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

    @Autowired
    private QuestionnaireMapper questionnaireMapper;
    @Override
    public int deleteByPrimaryKey(Integer qId) {
        return questionnaireMapper.deleteByPrimaryKey(qId);
    }

    @Override
    public int insert(Questionnaire record) {
        return questionnaireMapper.insert(record);
    }

    @Override
    public Questionnaire selectByPrimaryKey(Integer qId) {
        return questionnaireMapper.selectByPrimaryKey(qId);
    }

    @Override
    public List<Questionnaire> selectAll() {
        return questionnaireMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Questionnaire record) {
        return questionnaireMapper.updateByPrimaryKey(record);
    }
}
