package com.example.backend.service;

import com.example.backend.entity.User;
import com.example.backend.repository.UseraRepositor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
 private final UserRepository userRespository;

 
  public UserService(UserRepository userRepository){
    this.userRespository = userRespository;
  }

 
  public User createUser(User user){
    return userRespository.save(user);
  }

 public User getUserById( Long id){
    return userRespository.findById(id).orElse(null);
 }

 public List<User>getAllUsers(){
     return userRepository.findaAll();
 }

public User updateUser(Long id, User updateUser){
  Optional<User> optionalUser = userRespository.findById(id);
  if(optionalUser.isPresent()){

  }
}
}
