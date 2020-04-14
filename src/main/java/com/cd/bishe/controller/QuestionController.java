package com.cd.bishe.controller;

import com.cd.bishe.domain.Question;
import com.cd.bishe.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    
    @ResponseBody
    @RequestMapping("deleteQuestion")
    public int deleteByPrimaryKey(Integer questionId) {
        return questionService.deleteByPrimaryKey(questionId);
    }

    @ResponseBody
    @RequestMapping("addQuestion")
    public int insert(Question record) {
        return questionService.insert(record);
    }

    @ResponseBody
    @RequestMapping("getQuestion")
    public Question selectByPrimaryKey(Integer questionId) {
        return questionService.selectByPrimaryKey(questionId);
    }

    @ResponseBody
    @RequestMapping("getAllQuestion")
    public List<Question> selectAll() {
        return questionService.selectAll();
    }

    @ResponseBody
    @RequestMapping("editQuestion")
    public int updateByPrimaryKey(Question record) {
        return questionService.updateByPrimaryKey(record);
    }
}
