package com.osrapi.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.HexRiverCrossingEntity;
import com.osrapi.repositories.HexRiverCrossingRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class HexRiverCrossingController {
	/** the data repository. */
	@Autowired
	private HexRiverCrossingRepository repository;
	/**
	 * Gets a list of {@link HexRiverCrossingEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/river_crossings", method = RequestMethod.GET)
	public Object getAll() {
		Iterable<HexRiverCrossingEntity> iter = repository.findAll();
		ArrayList<HexRiverCrossingEntity> list = 
				new ArrayList<HexRiverCrossingEntity>();
		Iterator<HexRiverCrossingEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link HexRiverCrossingEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/river_crossings/{id}", method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
	/**
	 * Gets a single {@link HexRiverCrossingEntity} by its starting point and
	 * destination.
	 * @param to the starting point
	 * @param from the destination
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/river_crossings/to_from",
			method = RequestMethod.GET)
	public Object getByToAndFrom(@RequestParam(value = "to") final long to,
			@RequestParam(value = "from") final long from) {
		Object o = repository.findByToAndFrom(from, to);
		if (o == null) {
			o = repository.findByToAndFrom(to, from);
		}
		return o;
	}
}