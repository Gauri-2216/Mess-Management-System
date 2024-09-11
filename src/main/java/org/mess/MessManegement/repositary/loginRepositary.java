package org.mess.MessManegement.repositary;

import org.mess.MessManegement.Model.loginModel;

public interface loginRepositary {
	public loginModel isAddResister(loginModel model);
	public loginModel isCheckLogin(loginModel model);
	public boolean isCheckAdmin(loginModel lmodel);	
}
