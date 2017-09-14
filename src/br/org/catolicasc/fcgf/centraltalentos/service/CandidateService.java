package br.org.catolicasc.fcgf.centraltalentos.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.org.catolicasc.fcgf.centraltalentos.dao.CandidateDao;
import br.org.catolicasc.fcgf.centraltalentos.model.Candidate;
import br.org.catolicasc.fcgf.centraltalentos.model.CandidateWrapper;

@WebService
public class CandidateService {

	public CandidateService() {
		super();
	}

	@WebMethod
	@WebResult(name = "candidate")
	public List<CandidateWrapper> listCandidates() {
		return CandidateWrapper.ToList(new CandidateDao().list());
	}

	@WebMethod
	public Candidate consultCandidate(@WebParam(name = "id") int id) {
		CandidateDao dao = new CandidateDao();
		Candidate result = dao.find(id);
		return result;
	}

	@WebMethod
	@WebResult(name = "candidate")
	public List<Candidate> consultCandidates(@WebParam(name = "name") String name) {
		CandidateDao dao = new CandidateDao();
		List<Candidate> result = dao.searchByName(name);
		return result;
	}

}
