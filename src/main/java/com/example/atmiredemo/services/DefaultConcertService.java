package com.example.atmiredemo.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.atmiredemo.domain.Concert;
import com.example.atmiredemo.exceptions.ConcertNotFoundException;

@Service
/**
 * class for initialising test data
 * @author Sebastian Van der Borght
 *
 */
class DefaultConcertService implements ConcertService {
	List<Concert> concerts = new ArrayList<Concert>();

	DefaultConcertService() {
		concerts.add(new Concert(1, "Test", "test", LocalDateTime.now()));
		concerts.add(new Concert(2, "Test2", "test2", LocalDateTime.now()));
		concerts.add(new Concert(3, "Test3", "test3", LocalDateTime.now()));
	}

	@Override
	public Concert get(String id) {
		try {
			return concerts.get(Integer.parseInt(id) - 1);
		}
		catch (NumberFormatException | IndexOutOfBoundsException e) {
			throw new ConcertNotFoundException();
		}
	}
}
