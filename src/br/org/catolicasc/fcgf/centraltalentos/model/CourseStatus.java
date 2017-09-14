package br.org.catolicasc.fcgf.centraltalentos.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "courseStatus")
public enum CourseStatus {

	@XmlEnumValue("completed")
	Completed,

	@XmlEnumValue("studying")
	Studying,

	@XmlEnumValue("givenUp")
	GivenUp

}
