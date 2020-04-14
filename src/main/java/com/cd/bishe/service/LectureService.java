package com.cd.bishe.service;



import com.cd.bishe.domain.Lecture;

import java.util.List;

public interface LectureService {
    int deleteByPrimaryKey(Integer lectureId);

    int insert(Lecture record);

    Lecture selectByPrimaryKey(Integer lectureId);

    List<Lecture> selectAll();

    int updateByPrimaryKey(Lecture record);
}
