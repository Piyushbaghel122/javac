package com.example.backend.repository;

import com.example.backend.entity.User;
import org.springframework.data.jpa.reposutorty.jpaRepository;

public interface UserResitory extends jpaRepository<User , Long> {
}