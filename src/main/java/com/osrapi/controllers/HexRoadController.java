package com.osrapi.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.HexRoadEntity;
import com.osrapi.repositories.HexRoadRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class HexRoadController {
	/** the data repository. */
	@Autowired
	private HexRoadRepository repository;
	/**
	 * Gets a list of {@link HexRoadEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/roads", method = RequestMethod.GET)
	public Object getRoads() {
		Iterable<HexRoadEntity> iter = repository.findAll();
		ArrayList<HexRoadEntity> list = new ArrayList<HexRoadEntity>();
		Iterator<HexRoadEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link HexRoadEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/roads/{id}", method = RequestMethod.GET)
	public Object getEvent(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}