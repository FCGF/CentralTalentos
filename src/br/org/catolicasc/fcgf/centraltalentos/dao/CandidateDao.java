package br.org.catolicasc.fcgf.centraltalentos.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.org.catolicasc.fcgf.centraltalentos.model.Candidate;

public class CandidateDao extends AbstractDao<Candidate> {

	@SuppressWarnings("unchecked")
	public List<Candidate> searchByName(String name) {
		Session session = JpaUtil.getEntityManager().unwrap(Session.class);
		Criteria criteria = session.createCriteria(Candidate.class);
		criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
		return criteria.list();
		//Query query = JpaUtil.getEntityManager().createNamedQuery(Candidate.FIND_BY_NAME, Candidate.class);
		//query.setParameter("nome", name);
		//return query.getResultList();
		
	}

}
