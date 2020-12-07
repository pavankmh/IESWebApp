package com.iesweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "ACCOUNT_DETAILS")
public class AccountEntity {

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue
	private Integer userId;
	@Column(name = "ACC_STATUS")
	private String accountStatus;
	@Column(name = "ROLE")
	private String role;
	@Column(name = "SSN_NO")
	private String ssnNo;
	@CreationTimestamp
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	@Column(name = "DOB")
	private Date dateOfBirth;
	@Column(name = "Gender")
	private String gender;
	@UpdateTimestamp
	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "USER_EMAIL")
	private String email;
	@Column(name = "USER_MOBILE")
	private String userMobile;
	@Column(name = "USER_PASSWORD")
	private String userPzd;

}
