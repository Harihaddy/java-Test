package com.haddy.otp.dto;

import lombok.Data;

@Data
public class passwordResetDto {
	private String phoneNum;// distination
	private String userName;
	private String oneTimePass;
}
