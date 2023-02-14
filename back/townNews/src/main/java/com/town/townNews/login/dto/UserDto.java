package com.town.townNews.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

	@NonNull
	private String userEmail;
	
	@NonNull
	private String userPassword;
	
	private String nickName;
	
	private String phone;
	
}
