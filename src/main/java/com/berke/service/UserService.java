package com.berke.service;

import com.berke.repository.UserRepository;
import com.berke.repository.entity.User;

import java.util.Optional;

public class UserService {

    UserRepository userRepository;

    public UserService() {
        this.userRepository=new UserRepository();
    }


    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> kullaniciAdinaGoreKullaniciBul(String username) {
        return userRepository.kullaniciAdinaGoreKullaniciBul(username);
    }
}
