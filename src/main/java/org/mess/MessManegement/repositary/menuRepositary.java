package org.mess.MessManegement.repositary;

import java.util.List;

import org.mess.MessManegement.Model.candidate;
import org.mess.MessManegement.Model.menu;

public interface menuRepositary {

	public boolean isAddNewMenu(menu m1);
	public List<menu> getAllMenu();

}
