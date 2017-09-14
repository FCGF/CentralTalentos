package br.org.catolicasc.fcgf.centraltalentos.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Course extends Bean {

	public Course() {
		super();
	}

	public Course(int id) {
		super(id);
	}

	private double workload;
	private CourseType type;
	private String institution;
	private String city;
	private CourseStatus status;

	@ManyToOne
	@XmlTransient
	private Candidate candidate;

	public double getWorkload() {
		return workload;
	}

	public void setWorkload(double workload) {
		this.workload = workload;
	}

	public CourseType getType() {
		return type;
	}

	public void setType(CourseType type) {
		this.type = type;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public CourseStatus getStatus() {
		return status;
	}

	public void setStatus(CourseStatus status) {
		this.status = status;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

}
