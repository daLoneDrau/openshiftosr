package com.osrapi.controllers.dwarfstar.barbarianprince;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.dwarfstar.barbarianprince.EventEntity;
import com.osrapi.repositories.dwarfstar.barbarianprince.EventRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class EventController {
	/** the data repository. */
	@Autowired
	private EventRepository repository;
	/**
	 * Gets a list of {@link EventEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/barbarian_prince/events",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<EventEntity> iter = repository.findAll();
		ArrayList<EventEntity> list = new ArrayList<EventEntity>();
		Iterator<EventEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link EventEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/barbarian_prince/events/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}