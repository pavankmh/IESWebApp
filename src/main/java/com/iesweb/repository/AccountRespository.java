package com.iesweb.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iesweb.entity.AccountEntity;


@Repository
public interface AccountRespository extends JpaRepository<AccountEntity, Serializable> {

	public AccountEntity findByEmail(String email);
	

}