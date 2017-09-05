package com.example.mapper;

import com.example.bean.ConsultConfigArea;

import java.util.List;

public interface CommonMapper {
    
    int saveArea(ConsultConfigArea area);

    
    List<ConsultConfigArea> qryArea();
    

}
