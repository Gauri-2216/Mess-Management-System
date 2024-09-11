package org.mess.MessManegement.Service;

import org.mess.MessManegement.Model.loginModel;
import org.mess.MessManegement.repositary.loginRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("logService")
public class loginServiceImpl implements loginService{

	@Autowired
	loginRepositary regRepo;
	
	@Override
	public loginModel isAddRegister(loginModel model) {
		return regRepo.isAddResister(model);
	}

	@Override
	public loginModel isCheckLogin(loginModel model) {
		return regRepo.isCheckLogin(model);
	}

	@Override
	public boolean isCheckAdmin(loginModel lmodel) {
		return regRepo.isCheckAdmin(lmodel);
	}

}
