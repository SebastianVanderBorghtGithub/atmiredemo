package com.example.atmiredemo.restservices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.atmiredemo.domain.Concert;
import com.example.atmiredemo.exceptions.ConcertNotFoundException;
import com.example.atmiredemo.services.ConcertService;

@RestController
@RequestMapping("/concerts")
/**
 * Rest API
 * @author Sebastian Van der Borght
 *
 */
class ConcertRestController {
	private final ConcertService concertService;

	ConcertRestController(ConcertService concertService) {
		super();
		this.concertService = concertService;
	}

	@GetMapping("{concert}")
	/**
	 * 
	 * @param concert id
	 * @return data of concert
	 */
	Concert get(@PathVariable String concert) {
		return concertService.get(concert);
	}
	
	@ExceptionHandler(ConcertNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	void concertNotFound() {
	}
}
