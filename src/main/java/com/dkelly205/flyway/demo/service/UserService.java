package com.dkelly205.flyway.demo.service;

import com.dkelly205.flyway.demo.dto.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface UserService {

    Page<UserResponse> findAll(PageRequest pageRequest);
}
