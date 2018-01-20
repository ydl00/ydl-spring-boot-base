package cn.ydl.base.springboot.service;

import cn.ydl.base.springboot.domain.User;
import cn.ydl.base.springboot.mapper.UserMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HelloServiceImpl implements HelloService {


    @Autowired
    UserMapper userMapper;

    public void find() {
        //分页插件: 查询第1页，每页10行  
        Page<User> page = PageHelper.startPage(1, 10);
        userMapper.getAll();
        //数据表的总行数  
        page.getTotal();
        //分页查询结果的总行数  
        page.size();
        //第一个User对象，参考list，序号0是第一个元素，依此类推  
        page.get(0);
    }

}