package com.dkelly205.flyway.demo.controller;

import com.dkelly205.flyway.demo.dto.UserResponse;
import com.dkelly205.flyway.demo.service.UserService;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<Page<UserResponse>> findAll(
            @RequestParam(value="offset", required = false) Integer offset,
            @RequestParam(value="pageSize", required = false) Integer pageSize,
            @RequestParam(value="sortBy", required=false) String sortBy
    ){

        if(null == offset) offset = 0;
        if(null == pageSize) pageSize = 10;
        if(StringUtils.isEmpty(sortBy)) sortBy = "id";

        Page<UserResponse> users = userService.findAll(PageRequest.of(offset, pageSize, Sort.by(sortBy)));

        return ResponseEntity.ok(users);

    }
}
