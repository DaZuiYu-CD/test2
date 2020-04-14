package com.cd.bishe.service.impl;

import com.cd.bishe.mapper.LectureMapper;
import com.cd.bishe.domain.Lecture;
import com.cd.bishe.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureServiceImpl implements LectureService {

    @Autowired
    private LectureMapper lectureMapper;
    @Override
    public int deleteByPrimaryKey(Integer lectureId) {
        return lectureMapper.deleteByPrimaryKey(lectureId);
    }

    @Override
    public int insert(Lecture record) {
        return lectureMapper.insert(record);
    }

    @Override
    public Lecture selectByPrimaryKey(Integer lectureId) {
        return lectureMapper.selectByPrimaryKey(lectureId);
    }

    @Override
    public List<Lecture> selectAll() {
        return lectureMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Lecture record) {
        return lectureMapper.updateByPrimaryKey(record);
    }
}
