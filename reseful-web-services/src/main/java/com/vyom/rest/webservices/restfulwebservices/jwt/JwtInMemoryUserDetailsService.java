package com.vyom.rest.webservices.restfulwebservices.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "vyom",
        "$2a$10$fEWSwL.lEOC1NJRzuqfWrueuRrOoec435mKS6MD8sGPNqYvj2C6DC", "ROLE_USER_2"));
    
    inMemoryUserList.add(new JwtUserDetails(1L, "vyomshah",
            "$2a$10$UhJ1tGuo1WP8x5evgJgho.hjEUNVQnyl7YLCCmzm3wMgB1XQQbHdG", "ROLE_USER_2"));
  }

  
//  $2a$10$UhJ1tGuo1WP8x5evgJgho.hjEUNVQnyl7YLCCmzm3wMgB1XQQbHdG
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}


