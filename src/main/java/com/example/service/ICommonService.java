package com.example.service;

import com.example.bean.ConsultConfigArea;
import com.example.bean.ConsultContent;
import com.example.bean.User;

import java.util.List;
import java.util.Map;

public interface ICommonService {

    List<ConsultContent> queryContent(Map map);



    public List<ConsultConfigArea> qryArea();

    int saveArea(ConsultConfigArea area);

    int saveAreaToBase(ConsultConfigArea area);

    User findUserByName(String username);
}
