package org.mess.MessManegement.Service;

import java.util.List;

import org.mess.MessManegement.Model.menu;
import org.mess.MessManegement.repositary.menuRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mService")
public class menuServiceImpl implements menuService{

	@Autowired
	menuRepositary menuRepo;
	@Override
	public boolean isAddNewMenu(menu m1) {
		return menuRepo.isAddNewMenu(m1);
	}
	@Override
	public List<menu> getAllMenu() {
		return menuRepo.getAllMenu();
	}

}
