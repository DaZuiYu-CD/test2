package com.cd.bishe.mapper;

import com.cd.bishe.domain.Lecture;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LectureMapper {
    int deleteByPrimaryKey(Integer lectureId);

    int insert(Lecture record);

    Lecture selectByPrimaryKey(Integer lectureId);

    List<Lecture> selectAll();

    int updateByPrimaryKey(Lecture record);
}