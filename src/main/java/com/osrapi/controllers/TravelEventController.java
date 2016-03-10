package com.osrapi.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.TravelEventEntity;
import com.osrapi.repositories.TravelEventRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class TravelEventController {
	/** the data repository. */
	@Autowired
	private TravelEventRepository repository;
	/**
	 * Gets a list of {@link TravelEventEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/travel_events", method = RequestMethod.GET)
	public Object getAll() {
		Iterable<TravelEventEntity> iter = repository.findAll();
		ArrayList<TravelEventEntity> list = new ArrayList<TravelEventEntity>();
		Iterator<TravelEventEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link TravelEventEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/travel_events/{id}", method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
	/**
	 * Gets a single {@link TravelEventEntity} by its terrain and rolls.
	 * @param terrainName the terrain name
	 * @param roll1 the first roll
	 * @param roll2 the second roll
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/travel_events/by_roll",
			method = RequestMethod.GET)
	public Object getByNameAndRolls(
			@RequestParam(value = "terrain_name") final String terrainName,
			@RequestParam(value = "roll_1") final long roll1,
			@RequestParam(value = "roll_2") final long roll2) {
		Object o = repository.findByTerrainNameAndRoll1AndRoll2(
				terrainName, roll1, roll2);
		return o;
	}
}