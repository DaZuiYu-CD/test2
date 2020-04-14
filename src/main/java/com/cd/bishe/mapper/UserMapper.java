package com.cd.bishe.mapper;

import com.cd.bishe.domain.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long uId);

    int insert(User record);

    User selectByPrimaryKey(Long uId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}