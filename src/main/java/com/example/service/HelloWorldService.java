package com.example.service;

import com.example.pojo.TestUser;

/**
 * Created by intern07 on 16/12/22.
 */
public interface HelloWorldService {
    public TestUser getUserById(int u_id);
    public TestUser putNewUser(String nickname,String password,String email);
}
