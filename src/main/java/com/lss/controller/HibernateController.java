package com.lss.controller;

import com.lss.domain.User;
import com.lss.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by shuangshuangl on 2018/8/30.
 */
@Controller
@RequestMapping("/hibernate")
public class HibernateController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUserById")
    public User getUserById(Long id) {
        User u = userRepository.findAllById(id);
        System.out.println("userRepository");
        return u;
    }

    @RequestMapping("/saveUser")
    public void saveUser() {
        User u = new User();
        u.setUserName("lss");
        u.setAddress("重庆 ");
        u.setSex("s");
        userRepository.save(u);
    }
}
