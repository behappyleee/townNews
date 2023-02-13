package com.town.townNews.login.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class UserEntity {
	
	private int id;
	private String email;
	private String password;
	private String nickName;
	private String phone;
	
}
