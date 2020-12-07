package com.iesweb.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iesweb.domain.AccountDTO;
import com.iesweb.entity.AccountEntity;
import com.iesweb.repository.AccountRespository;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AccountRespository accounRepository;

	@Override
	public boolean isUniqueEmail(String email) {

		AccountEntity acEntity = accounRepository.findByEmail(email);
		return acEntity != null ? false : true;
	}

	@Override
	public boolean saveAccount(AccountDTO accountDTO) {
		
		accountDTO.setAccountStatus("ACTIVE");
		AccountEntity accountEntity = new AccountEntity();
		BeanUtils.copyProperties(accountDTO, accountEntity);
		AccountEntity savedEntity = 	accounRepository.save(accountEntity);
		return savedEntity.getUserId() != null ? true : false;
	
	}

	@Override
	public boolean sendRegSuccEmail(String to, String subject, String body) {
		
		return false;
	}

	@Override
	public boolean isTempPwdValid(String email, String tempPwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unlockAccount(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String recoverPassword(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendPwdToEmail(String email, String subject, String body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean upadteAccount(AccountDTO accountDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AccountDTO getAccountById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountDTO> getAllAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deactivateAccount(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
