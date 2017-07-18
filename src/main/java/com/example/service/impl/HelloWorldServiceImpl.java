package com.example.service.impl;
import javax.annotation.Resource;

import com.example.dao.TestUserMapper;
import com.example.pojo.TestUser;
import com.example.service.HelloWorldService;
import org.springframework.stereotype.Service;
/**
 * Created by intern07 on 16/12/22.
 */
@Service("HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Resource
    private TestUserMapper userDao;

    public TestUser getUserById(int u_id){
        return this.userDao.selectByPrimaryKey((long)u_id);
    }
    public TestUser putNewUser(String nickname,String password,String email){
        TestUser u = new TestUser();
        u.setEmail(email);
        u.setNickname(nickname);
        u.setPassword(password);
        userDao.insert(u);
        return u;
    }
}
