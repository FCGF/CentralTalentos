package br.org.catolicasc.fcgf.centraltalentos.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person extends Bean {

	public Person() {
		super();
	}

	public Person(int id) {
		super(id);
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
