package com.iesweb.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iesweb.domain.AccountDTO;

@Component
@Service
public interface AdminService {


	public boolean isUniqueEmail(String email);



	public boolean saveAccount(AccountDTO accountDTO);

	//public String getRegSuccMailBody(UserAccount userAccount);

	public boolean sendRegSuccEmail(String to, String subject, String body);

	public boolean isTempPwdValid(String email, String tempPwd);

	public boolean unlockAccount(String email, String password);

	public String recoverPassword(String email);

	//public String getRecoverPwdEmailBody(UserAccount userAccount);

	public String sendPwdToEmail(String email, String subject, String body);
	public boolean upadteAccount(AccountDTO accountDTO);
	public AccountDTO getAccountById(Integer id);
	public List<AccountDTO> getAllAccount();
	public boolean deactivateAccount(Integer id);

}
