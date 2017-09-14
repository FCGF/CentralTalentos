package br.org.catolicasc.fcgf.centraltalentos.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.org.catolicasc.fcgf.centraltalentos.adapter.DateAdapter;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Employment extends Bean {

	public Employment() {
		super();
	}

	public Employment(int id) {
		super(id);
	}

	private double remuneration;
	private String company;
	private String city;
	private String activities;

	@ManyToOne
	@XmlTransient
	private Candidate candidate;

	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date admissionDate;

	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date resignationDate;

	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getActivities() {
		return activities;
	}

	public void setActivities(String activities) {
		this.activities = activities;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Date getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(Date resignationDate) {
		this.resignationDate = resignationDate;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

}
