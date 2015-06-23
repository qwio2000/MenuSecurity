package com.jei.global.repo.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jei.global.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findOneByUserId(String userId);
}
