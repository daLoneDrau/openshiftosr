package com.osrapi.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.RollEntity;
import com.osrapi.repositories.RollRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class RollController {
	/** the data repository. */
	@Autowired
	private RollRepository repository;
	/**
	 * Gets a list of {@link RollEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/rolls", method = RequestMethod.GET)
	public Object getEvents() {
		Iterable<RollEntity> iter = repository.findAll();
		ArrayList<RollEntity> list = 
				new ArrayList<RollEntity>();
		Iterator<RollEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link RollEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/rolls/{id}", method = RequestMethod.GET)
	public Object getEvent(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}