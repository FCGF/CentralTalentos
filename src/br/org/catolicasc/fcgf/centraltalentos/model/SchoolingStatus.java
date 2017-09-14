package br.org.catolicasc.fcgf.centraltalentos.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name="schoolingStatus")
public enum SchoolingStatus {

	@XmlEnumValue("noSchooling")
	NoSchooling,
	
	@XmlEnumValue("elementaryIncomplete")
	ElementaryIncomplete,
	
	@XmlEnumValue("elementaryComplete")
	ElementaryComplete,
	
	@XmlEnumValue("middleIncomplete")
	MiddleIncomplete,
	
	@XmlEnumValue("middleComplete")
	MiddleComplete,
	
	@XmlEnumValue("highIncomplete")
	HighIncomplete,
	
	@XmlEnumValue("highComplete")
	HighComplete,
	
	@XmlEnumValue("higherIncomplete")
	HigherIncomplete,
	
	@XmlEnumValue("higherComplete")
	HigherComplete
	
}
