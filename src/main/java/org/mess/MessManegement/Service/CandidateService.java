package org.mess.MessManegement.Service;

import java.util.List;

import org.mess.MessManegement.Model.candidate;

public interface CandidateService {

	public boolean isAddNewCandidate(candidate candi);
	public List<candidate> getAllCandidate();
	public void isDeleteCandidateById(int id);
    public boolean isUpdateCandidate(candidate model);
	public List<candidate> getAllCandidateByName(String name);

}
