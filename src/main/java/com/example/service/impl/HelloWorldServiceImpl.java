package com.example.service.impl;
import javax.annotation.Resource;

import com.example.dao.UserMapper;
import com.example.pojo.User;
import com.example.service.HelloWorldService;
import org.springframework.stereotype.Service;
/**
 * Created by intern07 on 16/12/22.
 */
@Service("HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Resource
    private UserMapper userDao;

    public User getUserById(int u_id){
        return this.userDao.selectByPrimaryKey((long)u_id);
    }
}
