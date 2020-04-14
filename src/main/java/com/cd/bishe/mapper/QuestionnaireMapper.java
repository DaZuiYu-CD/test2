package com.cd.bishe.mapper;

import com.cd.bishe.domain.Questionnaire;
import java.util.List;

public interface QuestionnaireMapper {
    int deleteByPrimaryKey(Integer qId);

    int insert(Questionnaire record);

    Questionnaire selectByPrimaryKey(Integer qId);

    List<Questionnaire> selectAll();

    int updateByPrimaryKey(Questionnaire record);
}