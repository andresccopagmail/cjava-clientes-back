package com.ccopa.practica04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return getUserList().stream()
                .filter(user -> user.getUsername().equals(s))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("User not found."));
    }

    private List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("admin", passwordEncoder.encode("admin"), new ArrayList<>()));
        userList.add(new User("andres", passwordEncoder.encode("andres123"), new ArrayList<>()));
        return userList;
    }

}
