package br.org.catolicasc.fcgf.centraltalentos.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "courseType")
public enum CourseType {

	@XmlEnumValue("vocational")
	Vocational,

	@XmlEnumValue("technical")
	Technical,

	@XmlEnumValue("superior")
	Superior,

	@XmlEnumValue("postgraduate")
	Postgraduate,

	@XmlEnumValue("language")
	Language

}
