package com.iesweb.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AccountDTO {

	private Integer userId;
	private String accountStatus;
	private String role;
	private String ssnNo;
	private Date createdDate;
	private Date dateOfBirth;
	private String gender;
	private Date updatedDate;
	private String firstName;
	private String lastName;
	private String email;
	private String userMobile;
	private String userPzd;
}
