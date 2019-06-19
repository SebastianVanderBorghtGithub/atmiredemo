package com.example.atmiredemo.adapters;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {
	@Override
	public String marshal(LocalDateTime dateTime) throws Exception {
		return dateTime.toString();
	}

	@Override
	public LocalDateTime unmarshal(String string) throws Exception {
		return LocalDateTime.parse(string);
	}
}
