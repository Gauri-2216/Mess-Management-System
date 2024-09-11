package org.mess.MessManegement.controller;

import java.util.List;
import java.util.Map;

import org.mess.MessManegement.Model.candidate;
import org.mess.MessManegement.Model.menu;
import org.mess.MessManegement.Service.menuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class menuControlller {

	@Autowired
	menuService mService;
	
	@RequestMapping("/saveMenu")
	public String saveMenu(menu m1,Map map) {
		boolean b=mService.isAddNewMenu(m1);
		if(b) {
			map.put("msg","Menu save Success...");
		}else {
			map.put("msg","some problem is there");
		}
		
		return "menu";
	}
	@RequestMapping("/viewmenu")
	public String viewAllMenu(Map map) {
		List<menu> list=mService.getAllMenu();
        map.put("menuList", list);
		return "viewMenu";
	}
}
