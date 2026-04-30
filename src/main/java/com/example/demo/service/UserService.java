package com.example.demo.service;

import com.example.demo.dto.EmailRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User createuser(EmailRequest request){
        User user = new User();
        user.setEmail(request.getEmail());
        return userRepository.save(user);

    }


    // ← 新增！保存用户方法
    public User saveUser(String email) {
        User user = new User();
        user.setEmail(email);
        return userRepository.save(user);  // ← 真正写入数据库
    }
}