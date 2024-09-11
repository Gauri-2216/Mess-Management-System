package org.mess.MessManegement.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mess.MessManegement.Model.candidate;
import org.mess.MessManegement.Service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class CandidateController {

	@Autowired
	CandidateService canService;
	
	@RequestMapping("/savecandidate")
	public String saveCandidate(candidate candi,Map map)
	{
		boolean b=canService.isAddNewCandidate(candi);
		if(b)
		{
			map.put("msg","Record save Success");
		}else {
			map.put("msg","some problem is there");
		}
		return "candidate";
	}
	public List<candidate> getAllCandidate(){
		List<candidate> list=canService.getAllCandidate();
		return list;
	}
	@RequestMapping(value="/viewcan",method=RequestMethod.GET)
	public String viewCandidate(Map map) {
		map.put("candidateList",this.getAllCandidate() );
		return "viewCandidate";
	}
	
	@RequestMapping("/delCandiById")
	public String deleteCandidateId(@RequestParam("canid") Integer canid,Map map) {
		canService.isDeleteCandidateById(canid);
		map.put("candidateList",this.getAllCandidate());
		return "viewCandidate";
	}
	@RequestMapping("/updateCandidateById")
	public String UpdateCandidate(@RequestParam("canid") Integer canid,@RequestParam("name") String name,
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam("start") String start,
			@RequestParam("end") String end,
			@RequestParam("due") String due,
			@RequestParam("paid") String paid,
			@RequestParam("balance") String balance,Map <String,String>map) {
		map.put("id",""+canid);
		map.put("name",name);
		map.put("email",username);
		map.put("mobile",password);
		map.put("start",start);
		map.put("end",end);
		map.put("due",due);
		map.put("paid",paid);
		map.put("balance",balance);

		return "update";
	}
	@RequestMapping("/finalUpdate")
	public String updateCandidate(candidate model,Map map)
	{ 
		boolean b=canService.isUpdateCandidate(model);
		if(b) {
			map.put("msg","Candidate Updated");
		}else {
		map.put("msg","Candidate not Updated");	
		}
		return "update";
	}
	@RequestMapping("/searchByName")
	@ResponseBody
	public String searchByNameURL(@RequestParam("n") String name) {
		List<candidate> list=canService.getAllCandidateByName(name);
		String str="";
		str=str+"<table class'table'><tr><th>ID</th><th>Name</th><th>Email</th><th>Contact</th><th>Start Date</th><th>End Date</th><th>Due Date</th><th>Paid</th><th>Balance</th><th>DELETE</th><th>UPDATE</th></tr>";
		
		for(candidate c:list) {
			str=str+"<tr>";
			str=str+"<td>"+c.getId()+"</td>";
			str=str+"<td>"+c.getName()+"</td>";
			str=str+"<td>"+c.getUsername()+"</td>";
			str=str+"<td>"+c.getPassword()+"</td>";
			str=str+"<td>"+c.getStart()+"</td>";
			str=str+"<td>"+c.getEnd()+"</td>";
			str=str+"<td>"+c.getDue()+"</td>";
			str=str+"<td>"+c.getPaid()+"</td>";
			str=str+"<td>"+c.getBalance()+"</td>";
			str=str+"</tr>";

		}
		str=str+"</table>";
		return str;
	}
	@RequestMapping("/AddNewMenu")
	public String newMenuAdd() {
		return "menu";
	}
}
