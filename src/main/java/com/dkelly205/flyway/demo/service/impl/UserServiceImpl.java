package com.dkelly205.flyway.demo.service.impl;

import com.dkelly205.flyway.demo.dto.UserResponse;
import com.dkelly205.flyway.demo.mapper.UserMapper;
import com.dkelly205.flyway.demo.repository.UserRepository;
import com.dkelly205.flyway.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Page<UserResponse> findAll(PageRequest pageRequest) {

        return userRepository.findAll(pageRequest)
                .map(userMapper::toUserResponse);

    }
}
