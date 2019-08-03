package com.study.nexus.api;

import com.study.nexus.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * FileName: UserApi Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@FeignClient(name = "user-api")
public interface UserApi {

  @PostMapping("/add/user")
  Integer addUser(@RequestBody User user);

  @GetMapping("/user/{userId}")
  User findUserById(@PathVariable String userId);

}