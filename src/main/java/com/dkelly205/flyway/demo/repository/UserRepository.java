package com.dkelly205.flyway.demo.repository;

import com.dkelly205.flyway.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
