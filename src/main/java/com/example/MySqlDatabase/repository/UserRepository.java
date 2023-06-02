package com.example.MySqlDatabase.repository;

import com.example.MySqlDatabase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
