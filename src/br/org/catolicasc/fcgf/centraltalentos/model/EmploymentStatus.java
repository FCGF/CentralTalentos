package br.org.catolicasc.fcgf.centraltalentos.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name="employmentStatus")
public enum EmploymentStatus {
	
	@XmlEnumValue("employed")
	Employed,
	
	@XmlEnumValue("unemployed")
	Unemployed
}
