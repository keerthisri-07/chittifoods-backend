package com.chittifoodss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chittifoodss.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}