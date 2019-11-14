//package com.zealsay.resume.service.auth;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//
//@Slf4j
//@Service(value = "userDetailsService")
//public class UserDetailServiceImpl implements UserDetailsService {
//
//
//  @Override
//  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//    return new User("zeal","123",Collections
//            .singleton(new SimpleGrantedAuthority("ADMIN")));
//  }
//
//}
