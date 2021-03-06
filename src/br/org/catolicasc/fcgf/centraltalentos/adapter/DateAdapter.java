package br.org.catolicasc.fcgf.centraltalentos.adapter;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateAdapter extends XmlAdapter<XMLGregorianCalendar, Date> {

	@Override
	public Date unmarshal(XMLGregorianCalendar v) throws Exception {
		Date date = v.toGregorianCalendar().getTime();
		return date;
	}

	@Override
	public XMLGregorianCalendar marshal(Date v) throws Exception {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(v);
		XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		xmlGregorianCalendar.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
		// xmlGregorianCalendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		return xmlGregorianCalendar;
	}

}
