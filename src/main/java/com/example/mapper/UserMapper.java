package com.example.mapper;



import com.example.bean.User;

import java.util.List;

public interface UserMapper {
    
    List<User> findByUserName(String username);
}
