package com.cd.bishe.controller;

import com.cd.bishe.domain.Knowledge;
import com.cd.bishe.service.KnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/knowledge")
@CrossOrigin
public class KnowledgeController {
  @Autowired
    private KnowledgeService knowledgeService;

    @ResponseBody
    @RequestMapping("deleteKnowledge")
    public int deleteByPrimaryKey(Integer kId) {
        return knowledgeService.deleteByPrimaryKey(kId);
    }

    @ResponseBody
    @RequestMapping("addKnowledge")
    public int insert(@RequestBody  Knowledge record) {
        return knowledgeService.insert(record);
    }

    @ResponseBody
    @RequestMapping("getKnowledge")
    public Knowledge selectByPrimaryKey(Integer kId) {
        return knowledgeService.selectByPrimaryKey(kId);
    }

    @ResponseBody
    @RequestMapping("getAllKnowledge")
    public List<Knowledge> selectAll() {
        return knowledgeService.selectAll();
    }

    @ResponseBody
    @RequestMapping("getUser")
    public int updateByPrimaryKey(Knowledge record) {
        return knowledgeService.updateByPrimaryKey(record);
    }
}
