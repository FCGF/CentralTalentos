package br.org.catolicasc.fcgf.centraltalentos.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@NamedQueries({
		@NamedQuery(name = Candidate.FIND_BY_NAME, query = "select c from Candidate c where c.name like CONCAT('%', CONCAT(:nome,'%'))") })
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@XmlAccessorType(XmlAccessType.FIELD)
@PrimaryKeyJoinColumn(name = "id")
public class Candidate extends Person {

	public Candidate() {
		super();
		initializeLists();
	}

	public Candidate(int id) {
		super(id);
		initializeLists();
	}

	public static final String FIND_BY_NAME = "Candidate.findByName";

	private SchoolingStatus schooling;

	private int age;

	private double intendedSalary;

	private EmploymentStatus employment;

	@XmlElementWrapper(name = "employments")
	@XmlElement(name = "job")
	@OneToMany(targetEntity = Employment.class, mappedBy = "candidate", cascade = CascadeType.ALL)
	private List<Employment> previousJobs;

	@XmlElementWrapper(name = "courses")
	@XmlElement(name = "course")
	@OneToMany(targetEntity = Course.class, mappedBy = "candidate", cascade = CascadeType.ALL)
	private List<Course> courses;

	private double selfEvaluation;

	public SchoolingStatus getSchooling() {
		return schooling;
	}

	public void setSchooling(SchoolingStatus schooling) {
		this.schooling = schooling;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getIntendedSalary() {
		return intendedSalary;
	}

	public void setIntendedSalary(double intendedSalary) {
		this.intendedSalary = intendedSalary;
	}

	public EmploymentStatus getEmployment() {
		return employment;
	}

	public void setEmployment(EmploymentStatus employment) {
		this.employment = employment;
	}

	public List<Employment> getPreviousJobs() {
		return previousJobs;
	}

	public void setPreviousJobs(List<Employment> previousJobs) {
		this.previousJobs = previousJobs;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public double getSelfEvaluation() {
		return selfEvaluation;
	}

	public void setSelfEvaluation(double selfEvaluation) {
		this.selfEvaluation = selfEvaluation;
	}

	private void initializeLists() {
		setPreviousJobs(new ArrayList<Employment>());
		setCourses(new ArrayList<Course>());
	}

}
