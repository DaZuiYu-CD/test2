package com.cd.bishe.mapper;

import com.cd.bishe.domain.Question;
import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer questionId);

    int insert(Question record);

    Question selectByPrimaryKey(Integer questionId);

    List<Question> selectAll();

    int updateByPrimaryKey(Question record);
}