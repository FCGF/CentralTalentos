package br.org.catolicasc.fcgf.centraltalentos.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Bean {

	public Bean() {
		super();
	}

	public Bean(int id) {
		this();
		this.id = id;
	}

	@Id
	@GeneratedValue
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
