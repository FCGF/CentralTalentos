package br.org.catolicasc.fcgf.centraltalentos.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@XmlAccessorType(XmlAccessType.FIELD)
@PrimaryKeyJoinColumn(name = "id")
public class User extends Person {

	public User() {
		super();
	}

	public User(int id) {
		super(id);
	}

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
