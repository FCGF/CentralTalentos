package br.org.catolicasc.fcgf.centraltalentos.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class CandidateWrapper {

	public CandidateWrapper(Candidate entity) {
		super();
		this.entity = entity;
	}

	private Candidate entity;

	public int getId() {
		return entity.getId();
	}

	public void setId(int id) {
		entity.setId(id);
	}

	public String getName() {
		return entity.getName();
	}

	public void setName(String name) {
		entity.setName(name);
	}

	public SchoolingStatus getSchooling() {
		return entity.getSchooling();
	}

	public void setSchooling(SchoolingStatus schooling) {
		entity.setSchooling(schooling);
	}

	public int getAge() {
		return entity.getAge();
	}

	public void setAge(int age) {
		entity.setAge(age);
	}

	public double getIntendedSalary() {
		return entity.getIntendedSalary();
	}

	public void setIntendedSalary(double intendedSalary) {
		entity.setIntendedSalary(intendedSalary);
	}

	public EmploymentStatus getEmployment() {
		return entity.getEmployment();
	}

	public void setEmployment(EmploymentStatus employment) {
		entity.setEmployment(employment);
	}

	public static List<CandidateWrapper> ToList(List<Candidate> candidates) {
		List<CandidateWrapper> wrappers = new ArrayList<>();

		if (candidates != null) {
			for (Candidate candidate : candidates) {
				if (candidate != null) {
					wrappers.add(new CandidateWrapper(candidate));
				}
			}
		}

		return wrappers;
	}

}
