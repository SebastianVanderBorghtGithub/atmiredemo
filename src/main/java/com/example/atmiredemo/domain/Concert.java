package com.example.atmiredemo.domain;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.example.atmiredemo.adapters.LocalDateTimeAdapter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
/**
 * the class concert
 * @author Sebastian Van der Borght
 *
 */
public class Concert {
	private long id;
	private String artist;
	private String venue;
	@XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
	private LocalDateTime dateTime;
	
	public Concert() {
	}

	public Concert(long id, String artist, String venue, LocalDateTime dateTime) {
		this.id = id;
		this.artist = artist;
		this.venue = venue;
		this.dateTime = dateTime;
	}

	public long getId() {
		return id;
	}

	public String getArtist() {
		return artist;
	}

	public String getVenue() {
		return venue;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}
}
