package org.mess.MessManegement.Service;

import org.mess.MessManegement.Model.loginModel;

public interface loginService {
	public loginModel isAddRegister(loginModel model);
	public loginModel isCheckLogin(loginModel model);
	public boolean isCheckAdmin(loginModel lmodel);
}
