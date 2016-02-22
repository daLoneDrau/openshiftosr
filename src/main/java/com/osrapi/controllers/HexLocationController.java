package com.osrapi.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.HexLocationEntity;
import com.osrapi.repositories.HexLocationRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class HexLocationController {
	/** the data repository. */
	@Autowired
	private HexLocationRepository repository;
	/**
	 * Gets a list of {@link HexLocationEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/hexes", method = RequestMethod.GET)
	public Object getEvents() {
		Iterable<HexLocationEntity> iter = repository.findAll();
		ArrayList<HexLocationEntity> list = new ArrayList<HexLocationEntity>();
		Iterator<HexLocationEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link HexLocationEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/hexes/{id}", method = RequestMethod.GET)
	public Object getEvent(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}