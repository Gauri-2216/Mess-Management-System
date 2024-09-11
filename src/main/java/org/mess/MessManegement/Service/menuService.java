package org.mess.MessManegement.Service;

import java.util.List;

import org.mess.MessManegement.Model.candidate;
import org.mess.MessManegement.Model.menu;

public interface menuService {
	public boolean isAddNewMenu(menu m1);
	public List<menu> getAllMenu();

}
