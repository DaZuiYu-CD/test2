package com.cd.bishe.controller;

import com.cd.bishe.domain.Lecture;
import com.cd.bishe.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/lecture")
@CrossOrigin
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @ResponseBody
    @RequestMapping("deleteLecture")
    public int deleteByPrimaryKey(Integer lectureId) {
        return lectureService.deleteByPrimaryKey(lectureId);
    }

    @ResponseBody
    @PostMapping("addLecture")
    public int insert(@RequestBody Lecture record) {
        System.out.println("into add");
        System.out.println(record);
        return lectureService.insert(record);
    }

    @ResponseBody
    @RequestMapping("getLecture")
    public Lecture selectByPrimaryKey(Integer lectureId) {
        return lectureService.selectByPrimaryKey(lectureId);
    }

    @ResponseBody
    @RequestMapping("getAllLecture")
    public List<Lecture> selectAll() {
        return lectureService.selectAll();
    }

    @ResponseBody
    @RequestMapping("editLecture")
    public int updateByPrimaryKey(@RequestBody Lecture record) {
        return lectureService.updateByPrimaryKey(record);
    }
}
