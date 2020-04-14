package com.cd.bishe.service;

import com.cd.bishe.domain.Questionnaire;

import java.util.List;

public interface QuestionnaireService {
    int deleteByPrimaryKey(Integer qId);

    int insert(Questionnaire record);

    Questionnaire selectByPrimaryKey(Integer qId);

    List<Questionnaire> selectAll();

    int updateByPrimaryKey(Questionnaire record);
}
