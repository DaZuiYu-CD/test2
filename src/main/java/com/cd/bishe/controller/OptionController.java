package com.cd.bishe.controller;

import com.cd.bishe.domain.Option;
import com.cd.bishe.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/option")
@CrossOrigin
public class OptionController {
    
    @Autowired
    private OptionService optionService;

    @ResponseBody
    @RequestMapping("deleteOption")
    public int deleteByPrimaryKey(Integer optId) {
        return optionService.deleteByPrimaryKey(optId);
    }

    @ResponseBody
    @RequestMapping("addOption")
    public int insert(Option record) {
        return optionService.insert(record);
    }

    @ResponseBody
    @RequestMapping("getOption")
    public Option selectByPrimaryKey(Integer optId) {
        return optionService.selectByPrimaryKey(optId);
    }

    @ResponseBody
    @RequestMapping("getAllOption")
    public List<Option> selectAll() {
        return optionService.selectAll();
    }

    @ResponseBody
    @RequestMapping("editOption")
    public int updateByPrimaryKey(Option record) {
        return optionService.updateByPrimaryKey(record);
    }
}
