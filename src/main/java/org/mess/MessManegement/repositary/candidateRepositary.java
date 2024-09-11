package org.mess.MessManegement.repositary;

import java.util.List;

import org.mess.MessManegement.Model.candidate;

public interface candidateRepositary {

	public boolean isAddNewCandidate(candidate candi);
	public List<candidate> getAllCandidate();
	public void isDeleteCandidateById(int id);
	public boolean isUpdateCandidate(candidate model);
	public List<candidate> getAllCandidateByName(String name);


}
