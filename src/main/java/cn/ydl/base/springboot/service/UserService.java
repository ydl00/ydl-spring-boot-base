package cn.ydl.base.springboot.service;


import cn.ydl.base.springboot.domain.User;
import cn.ydl.base.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void add(User user) {
        userMapper.add(user);
    }


    public List<User> getAll() {

        return userMapper.getAll();
    }

}
