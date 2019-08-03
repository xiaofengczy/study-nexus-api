package com.study.nexus.dto;

import lombok.Data;

/**
 * FileName: User Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@Data
public class User {
  /**用户id*/
  private String userId;

  /**用户名*/
  private String userName;

  /**收货地址*/
  private String address;

  /**手机号*/
  private Integer phoneNum;
}