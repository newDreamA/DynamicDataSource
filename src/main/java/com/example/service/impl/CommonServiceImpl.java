package com.example.service.impl;

import com.example.bean.ConsultConfigArea;
import com.example.bean.ConsultContent;
import com.example.bean.User;
import com.example.mapper.CommonMapper;
import com.example.mapper.UserMapper;
import com.example.dynamicDataSource.TargetDataSource;
import com.example.service.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CommonServiceImpl  implements ICommonService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    CommonMapper mapper;
    @Override
    public List<ConsultContent> queryContent(Map map) {
        return null;
    }

    @TargetDataSource(name = "ds2")
    public List<ConsultConfigArea> qryArea() {
        return mapper.qryArea();
    }

    @Transactional
    @TargetDataSource(name = "ds2")
    public int saveArea(ConsultConfigArea area) {
        int cout = mapper.saveArea(area);
        //        throw new RuntimeException();
        return cout;
    }

    public int saveAreaToBase(ConsultConfigArea area) {
        return mapper.saveArea(area);
    }


    @TargetDataSource(name = "ds1")
    public User findUserByName(String username) {
        List<User> users = userMapper.findByUserName(username);
        return users.size() > 0 ? users.get(0) : null;
    }
}