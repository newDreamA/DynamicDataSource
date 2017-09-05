package com.example.controller;

import com.example.bean.ConsultConfigArea;
import com.example.bean.User;
import com.example.service.ICommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);


    @Autowired
    ICommonService commonService;

    @RequestMapping("/queryArea")
    public List<ConsultConfigArea> queryArea() {
        logger.info("查询开始！");
        List<ConsultConfigArea> areas = commonService.qryArea();
        logger.info("查询结束！");
        return areas;
    }


    @RequestMapping("/saveArea")
    public int saveArea(ConsultConfigArea area){
       return commonService.saveArea(area);
    }


    @RequestMapping("/queryUser")
    public User findUser(@RequestParam(value = "name")String username){
        return commonService.findUserByName(username);
    }
}
