package com.cd.bishe.controller;

import com.cd.bishe.domain.Questionnaire;
import com.cd.bishe.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/questionnaire")
@CrossOrigin
public class QuestionnaireController {

    @Autowired
    private QuestionnaireService questionnaireService;

    @ResponseBody
    @RequestMapping("deleteQuestionnaire")
    public int deleteByPrimaryKey(Integer qId) {
        return questionnaireService.deleteByPrimaryKey(qId);
    }

    @ResponseBody
    @RequestMapping("addQuestionnaire")
    public int insert(Questionnaire record) {
        return questionnaireService.insert(record);
    }

    @ResponseBody
    @RequestMapping("getQuestionnaire")
    public Questionnaire selectByPrimaryKey(Integer qId) {
        return questionnaireService.selectByPrimaryKey(qId);
    }

    @ResponseBody
    @RequestMapping("getAllQuestionnaire")
    public List<Questionnaire> selectAll() {
        return questionnaireService.selectAll();
    }

    @ResponseBody
    @RequestMapping("editQuestionnaire")
    public int updateByPrimaryKey(Questionnaire record) {
        return questionnaireService.updateByPrimaryKey(record);
    }
}
