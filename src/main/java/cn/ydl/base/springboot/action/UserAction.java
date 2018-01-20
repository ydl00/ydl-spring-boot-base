package cn.ydl.base.springboot.action;


import cn.ydl.base.springboot.domain.User;
import cn.ydl.base.springboot.mapper.UserMapper;
import cn.ydl.base.springboot.service.HelloService;
import cn.ydl.base.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserAction {

    @Autowired
    private UserService userService;



    @RequestMapping("all")
    public void a() {
        List<User> allUsers = userService.getAll();

        for (User allUser : allUsers) {

            System.out.println(allUser);
        }

    }


    @RequestMapping("add")
    public void add() {

        User user = new User();
        user.setId((int) (Math.random()*Integer.MAX_VALUE));
        user.setUsername(System.currentTimeMillis() + "");
        user.setPassword( "1323123");
        userService.add(user);

        System.out.println(user.getId());

    }


}
