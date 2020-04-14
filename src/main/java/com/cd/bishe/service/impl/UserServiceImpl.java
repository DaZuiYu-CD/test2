package com.cd.bishe.service.impl;

import com.cd.bishe.domain.User;
import com.cd.bishe.mapper.UserMapper;
import com.cd.bishe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Long uId) {
        return userMapper.deleteByPrimaryKey(uId);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(Long uId) {
        return userMapper.selectByPrimaryKey(uId);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
