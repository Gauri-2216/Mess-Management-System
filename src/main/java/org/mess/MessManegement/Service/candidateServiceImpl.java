package org.mess.MessManegement.Service;

import java.util.List;

import org.mess.MessManegement.Model.candidate;
import org.mess.MessManegement.repositary.candidateRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("canService")
public class candidateServiceImpl implements CandidateService {

	@Autowired
	candidateRepositary canRepo;

	@Override
	public boolean isAddNewCandidate(candidate candi) {

		return canRepo.isAddNewCandidate(candi);
	}

	@Override
	public List<candidate> getAllCandidate() {
		return canRepo.getAllCandidate();
	}

	@Override
	public void isDeleteCandidateById(int id) {
		 canRepo.isDeleteCandidateById(id);
	}

	@Override
	public boolean isUpdateCandidate(candidate model) {
		return canRepo.isUpdateCandidate(model);
	}

	@Override
	public List<candidate> getAllCandidateByName(String name) {
		return canRepo.getAllCandidateByName(name);
	}


}
